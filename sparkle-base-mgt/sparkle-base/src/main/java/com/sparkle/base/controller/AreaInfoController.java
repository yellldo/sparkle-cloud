package com.sparkle.base.controller;

import com.sparkle.base.service.AreaInfoService;
import com.sparkle.domain.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName : AreaInfoController<br>
 * Description : AreaInfoController<br>
 *
 * @author : sj
 * @date : 2022/3/1
 */
@RestController
public class AreaInfoController {

    @Autowired
    private AreaInfoService areaInfoService;


    @GetMapping
    public R areaInfoList() {
        areaInfoService.list();
        return R.ok();
    }


}
