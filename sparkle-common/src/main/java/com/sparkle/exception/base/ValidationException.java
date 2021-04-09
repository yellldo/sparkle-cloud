package com.sparkle.exception.base;


import com.sparkle.exception.BaseException;
import com.sparkle.exception.SysErrorEnum;

/**
 * ClassName : ValidationException<br>
 * Description : TODO<br>
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2021/2/16
 */
public class ValidationException extends BaseException {

    public ValidationException(String message) {
        super(SysErrorEnum.VALIDATION_ERROR);
        this.setErrorMessage(message);
    }

}
