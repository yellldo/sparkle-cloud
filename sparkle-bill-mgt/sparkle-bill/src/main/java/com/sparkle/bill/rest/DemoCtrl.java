package com.sparkle.bill.rest;

import com.sparkle.domain.R;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("test")
    public R test() {
        return R.ok("test");
    }
}
