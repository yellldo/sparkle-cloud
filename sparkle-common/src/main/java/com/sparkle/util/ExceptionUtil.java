package com.sparkle.util;

import com.sparkle.exception.IErrorCode;
import com.sparkle.exception.base.BusinessException;

/**
 * ClassName : ExceptionUtil<br>
 * Description : 异常抛出工具类<br>
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2021/4/9
 */
public class ExceptionUtil {

    /**
     * 抛出业务异常
     *
     * @param errCode
     * @param errMsg
     * @return
     */
    public static BusinessException throwBusinesEx(String errCode, String errMsg) {
        throw new BusinessException(new IErrorCode() {
            @Override
            public String getErrorCode() {
                return errCode;
            }

            @Override
            public String getErrorMessage() {
                return errMsg;
            }
        });
    }

    /**
     * 抛出业务异常
     *
     * @param errCode
     * @return
     */
    public static BusinessException throwBusinesEx(String errCode) {
        throw new BusinessException(new IErrorCode() {
            @Override
            public String getErrorCode() {
                return errCode;
            }

            @Override
            public String getErrorMessage() {
                return errCode;
            }
        });
    }
}
