package com.sparkle.exception;

/**
 * ClassName : CustomException<br>
 * Description : TODO<br>
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2020/7/27 18:36
 **/
public class CustomException extends RuntimeException {


    private int status = 500;

    public CustomException(String message, int status) {
        super(message);
        this.status = status;
    }
}
