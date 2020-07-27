package com.sparkle.exception.assertion;

import com.sparkle.constant.IResponse;
import com.sparkle.exception.ArgumnetException;
import com.sparkle.exception.BaseException;

import java.text.MessageFormat;

/**
 * ClassName : CommonExceptionAssert
 * Description : TODO
 *
 * @author : shenjia
 * @version : 1.0.0
 * @date : 2020/5/26 15:17
 **/
public interface CommonExceptionAssert extends IResponse, Assert {

    @Override
    default BaseException customException(Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);
        return new ArgumnetException(this, args, msg);
    }

    @Override
    default BaseException customException(Throwable t, Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);
        return new ArgumnetException(this, args, msg, t);
    }

}

