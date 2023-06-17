package com.sparkle.gateway.config;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.filter.factory.rewrite.CachedBodyOutputMessage;
import org.springframework.cloud.gateway.support.BodyInserterContext;
import org.springframework.cloud.gateway.support.DefaultServerRequest;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpRequestDecorator;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * ClassName : ValidateFilter<br>
 * Description : ValidateFilter<br>
 *
 * @author : sj
 * @date : 2023/6/17
 */
@Component
public class ValidateFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerRequest serverRequest = new DefaultServerRequest(exchange);
        // mediaType
        MediaType mediaType = exchange.getRequest().getHeaders().getContentType();
        String method = exchange.getRequest().getMethodValue();
        // read & modify body
        if ("POST".equals(method)) {
            Mono<String> modifiedBody = serverRequest.bodyToMono(String.class).flatMap(body -> {
                if (MediaType.APPLICATION_FORM_URLENCODED.isCompatibleWith(mediaType)) {
                    // origin body map
                    //这是你post请求获取到的参数
                    Map<String, Object> bodyMap = decodeBody(body);
                    //这里做你的业务操作


                    // new body map
                    Map<String, Object> newBodyMap = new HashMap<>();
                    //重新放回
                    return Mono.just(encodeBody(newBodyMap));
                }
                return Mono.empty();
            });

            BodyInserter bodyInserter = BodyInserters.fromPublisher(modifiedBody, String.class);
            HttpHeaders headers = new HttpHeaders();
            headers.putAll(exchange.getRequest().getHeaders());

            // the new content type will be computed by bodyInserter
            // and then set in the request decorator
            headers.remove(HttpHeaders.CONTENT_LENGTH);

            CachedBodyOutputMessage outputMessage = new CachedBodyOutputMessage(exchange, headers);
            return bodyInserter.insert(outputMessage, new BodyInserterContext()).then(Mono.defer(() -> {
                ServerHttpRequestDecorator decorator = new ServerHttpRequestDecorator(exchange.getRequest()) {

                    @Override
                    public HttpHeaders getHeaders() {
                        long contentLength = headers.getContentLength();
                        HttpHeaders httpHeaders = new HttpHeaders();
                        httpHeaders.putAll(super.getHeaders());
                        if (contentLength > 0) {
                            httpHeaders.setContentLength(contentLength);
                        } else {
                            httpHeaders.set(HttpHeaders.TRANSFER_ENCODING, "chunked");
                        }
                        return httpHeaders;
                    }

                    @Override
                    public Flux<DataBuffer> getBody() {
                        return outputMessage.getBody();
                    }
                };
                return chain.filter(exchange.mutate().request(decorator).build());
            }));
        } else if ("GET".equals(method)) {
            Map requestQueryParams = exchange.getRequest().getQueryParams();

            return chain.filter(exchange);
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }

    private Map<String, Object> decodeBody(String body) {
        return Arrays.stream(body.split("&")).map(s -> s.split("="))
                .collect(Collectors.toMap(arr -> arr[0], arr -> arr[1]));
    }

    private String encodeBody(Map<String, Object> map) {
        return map.entrySet().stream().map(e -> e.getKey() + "=" + e.getValue()).collect(Collectors.joining("&"));
    }
}
