package com.sparkle.exception;

import com.sparkle.exception.assertion.BusinessExceptionAssert;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ClassName : BusinessResponseEnum<br>
 * Description : BusinessResponseEnum<br>
 * Company : rrtx
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2020/7/27 17:29
 **/
@Getter
@AllArgsConstructor
public enum BusinessResponseEnum implements BusinessExceptionAssert {
    BAD_LICENSE_TYPE(7001, "Bad License type!");


    /**
     * 错误码
     */
    private int code;

    /**
     * 错误消息
     */
    private String message;

}
