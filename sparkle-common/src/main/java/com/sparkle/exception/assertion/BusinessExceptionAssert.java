package com.sparkle.exception.assertion;

import com.sparkle.constant.IResponse;
import com.sparkle.exception.BaseException;

import java.text.MessageFormat;

/**
 * ClassName : BusinessExceptionAssert<br>
 * Description : BusinessExceptionAssert <br>
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2020/7/27 17:23
 **/
public interface BusinessExceptionAssert extends Assert, IResponse {

    @Override
    default BaseException customException(Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);
        return new BaseException(this, args, msg);
    }

    @Override
    default BaseException customException(Throwable cause, Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);
        return new BaseException(this, args, msg, cause);
    }
}
