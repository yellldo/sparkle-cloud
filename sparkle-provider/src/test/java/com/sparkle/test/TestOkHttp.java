package com.sparkle.test;


import com.alibaba.fastjson.JSONObject;
import com.sparkle.util.OkHttpUtils;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.junit.Test;

import java.io.IOException;

@Slf4j
public class TestOkHttp {

    @Test
    public void get() {
        OkHttpUtils.ICallback iCallback = new OkHttpUtils.ICallback() {
            @Override
            public void invoke(String str) {
                log.info("返回数据：{}", str);
            }
        };
        OkHttpUtils.getInstance().doGet("http://localhost:8001/test/", iCallback);
    }

    @Test
    public void post() {
        Callback callback = new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                log.info("{}","失败了");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                log.info("返回数据：{}", response.body().string());
            }
        };
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("size", 10);
        jsonObject.put("age", 20);
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody requestBody = FormBody.create(mediaType, jsonObject.toJSONString());

        OkHttpUtils.getInstance().doPost("http://localhost:8001/test/", requestBody, callback);
    }


}
