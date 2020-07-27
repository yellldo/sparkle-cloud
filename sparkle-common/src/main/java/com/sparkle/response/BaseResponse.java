package com.sparkle.response;

import com.sparkle.constant.IResponse;
import com.sparkle.exception.CommonResponseEnum;

/**
 * ClassName : BaseResponse<br>
 * Description : TODO<br>
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2020/7/27 17:37
 **/
public class BaseResponse {

    protected int code;

    protected String message;

    public BaseResponse() {
        // 默认创建成功的回应
        this(CommonResponseEnum.SUCCESS);
    }

    public BaseResponse(IResponse response) {
        this(response.getCode(), response.getMessage());
    }

    public BaseResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
