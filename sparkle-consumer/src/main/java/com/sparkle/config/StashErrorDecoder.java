package com.sparkle.config;

import feign.Response;
import feign.codec.DecodeException;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import static feign.FeignException.errorStatus;

/**
 * ClassName : StashErrorDecoder<br>
 * Description : TODO<br>
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2020/7/27 17:53
 **/
@Slf4j
@Configuration
public class StashErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        log.info("进来了");
        if (response.status() >= 400 && response.status() <= 499) {
            return new RuntimeException();
        }
        if (response.status() >= 500 && response.status() <= 599) {
            return new RuntimeException(response.reason());
        }
        return errorStatus(methodKey, response);
    }
}
