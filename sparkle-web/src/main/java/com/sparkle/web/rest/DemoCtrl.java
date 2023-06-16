package com.sparkle.web.rest;

import com.sparkle.domain.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * ClassName : DemoCtrl<br>
 * Description : DemoCtrl<br>
 *
 * @author : sj
 * @date : 2023/6/16
 */
@RestController
public class DemoCtrl {

    @GetMapping("test")
    public R test() {
        return R.ok("test");
    }
}
