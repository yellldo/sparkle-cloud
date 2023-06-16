package com.sparkle.adm.rest;

import com.sparkle.domain.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName : TestCtrl<br>
 * Description : TestCtrl<br>
 *
 * @author : sj
 * @date : 2023/6/16
 */
@RestController
public class TestCtrl {

    @GetMapping("test")
    public R test() {
        return R.ok("test");
    }
}
