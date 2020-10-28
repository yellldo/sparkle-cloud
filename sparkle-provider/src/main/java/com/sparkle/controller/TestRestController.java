package com.sparkle.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.sparkle.dto.TestIn;
import com.sparkle.exception.CommonResponseEnum;
import com.sparkle.model.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
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
    public R test(TestIn testIn) {
//        CommonResponseEnum.SERVER_ERROR.assertIsNull("");
        log.info("{}", test);
        return R.ok(testIn);
    }

    @GetMapping("/")
    public R get() {
        return R.ok("12345");
    }

}
