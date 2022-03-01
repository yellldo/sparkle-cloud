package com.sparkle.base.controller;

import com.sparkle.base.service.SysDictInfoService;
import com.sparkle.domain.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName : SysDictController<br>
 * Description : SysDictController<br>
 *
 * @author : sj
 * @date : 2022/3/1
 */
@RestController
public class SysDictController {

    @Autowired
    private SysDictInfoService sysDictInfoService;

    @GetMapping("querySysDict")
    public R querySysDict() {


        return R.ok();
    }

}
