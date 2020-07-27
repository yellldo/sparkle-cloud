package com.sparkle.exception;

import com.sparkle.constant.IResponse;

/**
 * ClassName : BusinessException<br>
 * Description : BusinessException <br>
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2020/7/27 17:16
 **/
public class BusinessException extends BaseException {

    public BusinessException(IResponse response, Object[] args, String message) {
        super(response, args, message);
    }

    public BusinessException(IResponse response, Object[] args, String message, Throwable cause) {
        super(response, args, message, cause);
    }
}
