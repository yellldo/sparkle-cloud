package com.sparkle.adm.utils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * ClassName : HttpContextUtil<br>
 * Description : HttpContextUtil<br>
 *
 * @author : sj
 * @version : 1.0.0 2021/8/5
 */
public class HttpContextUtil {

    private HttpContextUtil() {

    }

    public static HttpServletRequest getHttpServletRequest() {
        return ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
    }
}
