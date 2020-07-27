package com.sparkle.constant;

/**
 * ClassName : IResponse<br>
 * Description : TODO<br>
 * Company : rrtx
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2020/7/27 17:10
 **/
public interface IResponse {

    /**
     * 错误码
     *
     * @return
     */
    int getCode();

    /**
     * 消息
     *
     * @return
     */
    String getMessage();
}
