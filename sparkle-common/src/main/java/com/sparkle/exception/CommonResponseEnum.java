package com.sparkle.exception;

import com.sparkle.exception.assertion.CommonExceptionAssert;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ClassName : CommonResponseEnum
 * Description : TODO
 *
 * @author : shenjia
 * @version : 1.0.0
 * @date : 2020/5/26 15:19
 **/

@Getter
@AllArgsConstructor
public enum CommonResponseEnum implements CommonExceptionAssert {
    // 成功
    SUCCESS(200, "SUCCESS"),
    // 服务器繁忙，请稍后重试
    SERVICE_BUSY(201, "服务器繁忙"),
    // 服务器异常，无法识别的异常，尽可能对同归判断减少未定义异常抛出
    SERVER_ERROR(202, "网络异常");

    private int code;

    private String message;
}
