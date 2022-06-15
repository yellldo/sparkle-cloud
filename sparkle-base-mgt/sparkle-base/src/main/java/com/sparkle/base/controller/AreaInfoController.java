package com.sparkle.base.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.sparkle.api.base.dto.QueryAreaInfoDto;
import com.sparkle.base.entity.AreaInfo;
import com.sparkle.base.service.AreaInfoService;
import com.sparkle.domain.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public R queryAreaInfo(@RequestBody QueryAreaInfoDto queryAreaInfoDto) {
        LambdaQueryWrapper<AreaInfo> queryWrapper = new LambdaQueryWrapper<>();
        List<AreaInfo> areaInfoList = areaInfoService.list(queryWrapper);
        return R.ok(areaInfoList);
    }


}
