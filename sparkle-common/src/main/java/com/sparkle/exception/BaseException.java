package com.sparkle.exception;

import com.sparkle.constant.IResponse;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * ClassName : BaseException<br>
 * Description : 基础异常定义 <br>
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2020/7/27 17:09
 **/
@Slf4j
@Getter
public class BaseException extends RuntimeException {

    /**
     * 返回码
     */
    private IResponse response;

    /**
     * 异常消息参数
     */
    protected Object[] args;


    public BaseException(IResponse response) {
        super(response.getMessage());
        this.response = response;
    }

    public BaseException(String message, IResponse response) {
        super(message);
        this.response = new IResponse() {
            @Override
            public int getCode() {
                return response.getCode();
            }

            @Override
            public String getMessage() {
                return message;
            }
        };
    }

    public BaseException(IResponse response, Object[] args, String message) {
        super(message);
        this.response = response;
        this.args = args;
    }

    public BaseException(IResponse response, Object[] args, String message, Throwable cause) {
        super(message, cause);
        this.response = response;
        this.args = args;
    }

}
