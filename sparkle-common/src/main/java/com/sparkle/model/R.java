package com.sparkle.model;

import lombok.Getter;
import lombok.Setter;

/**
 * ClassName : R<br>
 * Description : TODO<br>
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2020/7/27 19:37
 **/
@Getter
@Setter
public class R<T> {

    private T data;

    private int code;

    private String message;

    public R() {

    }

    public R(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public R setData(T data) {
        this.data = data;
        return this;
    }

    public R data(T data) {
        this.setData(data);
        return this;
    }

    public static R ok() {
        return new R();
    }

    public static R ok(Object data) {
        return (new R()).data(data);
    }

    public static R code(int code, String message) {
        R<Object> r = new R<>();
        r.setCode(code);
        r.setMessage(message);
        return r;
    }

    @Override
    public String toString() {
        return "R{" +
                "data=" + data +
                ", code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
