package com.sparkle.exception;

import com.sparkle.exception.assertion.CommonExceptionAssert;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ClassName : ArgumentResponseEnum
 * Description : 参数枚举
 *
 * @author : shenjia
 * @version : 1.0.0
 * @date : 2020/5/26 17:53
 **/
@Getter
@AllArgsConstructor
public enum ArgumentResponseEnum implements CommonExceptionAssert {
    /**
     * 绑定参数校验异常
     */
    VALID_ERROR(6000, "参数校验异常"),
    ;

    private int code;

    private String message;
}
