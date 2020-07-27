package com.sparkle.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparkle.exception.CustomException;
import com.sparkle.model.FeignFailResult;
import feign.Response;
import feign.Util;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;

import java.io.IOException;

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
        Exception exception = null;
        ObjectMapper mapper = new ObjectMapper();

        log.info("进来了");
        try {
            String body = Util.toString(response.body().asReader());
            exception = new RuntimeException(body);

            if (StringUtils.isEmpty(body)) {
                return null;
            }
            FeignFailResult result = mapper.readValue(body, FeignFailResult.class);
            // 业务异常包装成自定义异常类MyException
            if (result.getStatus() != HttpStatus.OK.value()) {
                exception = new CustomException(result.getMessage(), result.getStatus());
            }
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }
        return exception;
    }
}
