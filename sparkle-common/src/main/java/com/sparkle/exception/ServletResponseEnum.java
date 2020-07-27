package com.sparkle.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.servlet.http.HttpServletResponse;

/**
 * ClassName : ServletResponseEnum
 * Description : TODO
 *
 * @author : shenjia
 * @version : 1.0.0
 * @date : 2020/5/26 15:26
 **/
@Getter
@AllArgsConstructor
public enum ServletResponseEnum {
    MethodArgumentNotVaildException(4400, "", HttpServletResponse.SC_BAD_REQUEST),
    MethodArgumentTypeMismatchException(4400, "", HttpServletResponse.SC_BAD_REQUEST),
    MissingServletRequestPartException(4400, "", HttpServletResponse.SC_BAD_REQUEST),
    MissingPathVariableException(4400, "", HttpServletResponse.SC_BAD_REQUEST),
    BindException(4400, "", HttpServletResponse.SC_BAD_REQUEST),
    MissingServletRequestParameterException(4400, "", HttpServletResponse.SC_BAD_REQUEST),
    TypeMismatchException(4400, "", HttpServletResponse.SC_BAD_REQUEST),
    ServletRequestBindingException(4400, "", HttpServletResponse.SC_BAD_REQUEST),
    HttpMessageNotReadableException(4400, "", HttpServletResponse.SC_BAD_REQUEST),
    NoHandlerFoundException(4400, "", HttpServletResponse.SC_BAD_REQUEST),
    NoSuchRequestHandlingMethodException(4400, "", HttpServletResponse.SC_BAD_REQUEST),
    HttpRequestMethodNitSupportException(4400, "", HttpServletResponse.SC_BAD_REQUEST),
    ;

    private int code;

    private String message;

    private int statusCode;

}
