package com.sparkle.response;

/**
 * ClassName : ErrorResponse
 * Description : TODO
 *
 * @author : shenjia
 * @version : 1.0.0
 * @date : 2020/5/26 17:39
 **/
public class ErrorResponse extends BaseResponse {

    public ErrorResponse() {

    }

    public ErrorResponse(int code, String message) {
        super(code, message);
    }
}
