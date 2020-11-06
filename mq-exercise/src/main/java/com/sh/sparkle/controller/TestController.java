package com.sh.sparkle.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName : TestController<br>
 * Description : <br>
 * Company : rrtx
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2020/11/6
 **/
@RestController
@Slf4j
public class TestController {

    @PostMapping("aa")
    public void aa(){
        log.info("1234");
    }
}
