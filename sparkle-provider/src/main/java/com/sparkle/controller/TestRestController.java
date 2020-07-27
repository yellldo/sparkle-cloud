package com.sparkle.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName : TestRestController<br>
 * Description : TODO<br>
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2020/7/9 16:48
 **/
@RestController
@RequestMapping("/test")
@Slf4j
public class TestRestController {

    @NacosValue("${test}")
    private String test;

    @PostMapping("/")
    public void test() {
        log.info("{}", test);
    }

}
