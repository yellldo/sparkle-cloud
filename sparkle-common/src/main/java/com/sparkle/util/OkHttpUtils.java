package com.sparkle.util;

import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

/**
 * okhttp工具类
 *
 * @author sj
 * @date 2020-10-28
 */
@Slf4j
public class OkHttpUtils {

    static OkHttpUtils okHttpUtils;

    private OkHttpClient.Builder builder;

    private OkHttpClient okHttpClient;

    private Request.Builder requestBuilder;

    private OkHttpUtils() {
        builder = new OkHttpClient.Builder();
        okHttpClient = builder.addInterceptor(new RequestLoggerInterceptor())
                .addInterceptor(new ResponseLoggerInterceptor()).build();
        requestBuilder = new Request.Builder();
    }

    public static OkHttpUtils getInstance() {
        if (null == okHttpUtils) {
            synchronized (OkHttpUtils.class) {
                if (null == okHttpUtils) {
                    okHttpUtils = new OkHttpUtils();
                }
            }
        }
        return okHttpUtils;
    }

    /**
     * get请求
     *
     * @param url      请求路径 可带参数
     * @param callback 回调
     */
    public void doGet(String url, ICallback callback) {
        Request request = requestBuilder.get().url(url).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                callback.invoke(e.getMessage());
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                callback.invoke(response.body().string());
            }
        });
    }

    /**
     * get请求
     *
     * @param url      请求路径
     * @param formBody 入参
     * @param callback 回调
     */
    public void doGet(String url, FormBody formBody, ICallback callback) {
        Request request = requestBuilder.method("GET", formBody).url(url).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                callback.invoke(e.getMessage());
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                callback.invoke(response.body().string());
            }
        });
    }

    /**
     * post请求
     *
     * @param url      请求路径
     * @param requestBody 请求数据
     * @param callback 回调
     */
    public void doPost(String url, RequestBody requestBody, Callback callback) {
        Request request = requestBuilder.method("POST", requestBody).url(url).build();
        okHttpClient.newCall(request).enqueue(callback);
    }


    /**
     * 接口用于回调数据
     */
    public interface ICallback {
        void invoke(String str);
    }

    /**
     * 请求拦截
     */
    static class RequestLoggerInterceptor implements Interceptor {
        @NotNull
        @Override
        public Response intercept(@NotNull Chain chain) throws IOException {
            Request request = chain.request();
            log.info("请求路径：{}", request.url());
            log.info("请求方法：{}", request.method());
            log.info("请求头：{}", request.headers());
            log.info("请求体：{}", request.body());
            return chain.proceed(request);
        }
    }

    /**
     * 响应拦截
     */
    static class ResponseLoggerInterceptor implements Interceptor {
        @NotNull
        @Override
        public Response intercept(@NotNull Chain chain) throws IOException {
            Response response = chain.proceed(chain.request());

            if (response.body() != null && response.body().contentType() != null) {
                MediaType mediaType = response.body().contentType();
                String str = response.body().string();
                log.info("返回类型：{}", mediaType);
                log.info("返回体：{}", str);
                ResponseBody responseBody = ResponseBody.create(mediaType, str);
                return response.newBuilder().body(responseBody).build();
            }
            return response;
        }
    }

}
