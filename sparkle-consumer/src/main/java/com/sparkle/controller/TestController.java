package com.sparkle.controller;

import com.sparkle.feign.TestFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName : TestController<br>
 * Description : TODO<br>
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2020/7/9 17:10
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestFeignClient testFeignClient;

    @PostMapping("/aa")
    public void test() {
        testFeignClient.test();
    }

}

