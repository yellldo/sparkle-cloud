package com.sparkle.adm.aspect;

import com.sparkle.adm.utils.HttpContextUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * ClassName : LogAspect<br>
 * Description : LogAspect<br>
 *
 * @author : sj
 * @date : 2023/6/16
 */
@Slf4j
@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(* com.sparkle.adm.rest..*(..))")
    public void point() {

    }

    @Before("point()")
    public void pointBefore(JoinPoint joinPoint) {
        HttpServletRequest request = HttpContextUtil.getHttpServletRequest();
        String url = request.getRequestURI();
        Object[] args = joinPoint.getArgs();
        log.info("{},入参：{}", url, args[0]);
    }
}
