package com.sparkle.exception;

import com.sparkle.constant.IResponse;

/**
 * ClassName : ArgumnetException
 * Description : TODO
 *
 * @author : shenjia
 * @version : 1.0.0
 * @date : 2020/5/26 15:03
 **/
public class ArgumnetException extends BaseException {

    public ArgumnetException(IResponse response, Object[] args, String message) {
        super(response, args, message);
    }

    public ArgumnetException(IResponse response, Object[] args, String message, Throwable cause) {
        super(response, args, message, cause);
    }
}
