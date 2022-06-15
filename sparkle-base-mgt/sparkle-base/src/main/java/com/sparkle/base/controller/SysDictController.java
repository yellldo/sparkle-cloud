package com.sparkle.base.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.sparkle.api.base.dto.QuerySysDictDto;
import com.sparkle.api.base.service.SysDictService;
import com.sparkle.base.entity.SysDictInfo;
import com.sparkle.base.service.SysDictInfoService;
import com.sparkle.domain.R;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public R querySysDict(@RequestBody QuerySysDictDto querySysDictDto) {
        LambdaQueryWrapper<SysDictInfo> queryWrapper = new LambdaQueryWrapper<>();
        if (StringUtils.isNotBlank(querySysDictDto.getKwKey())) {
            queryWrapper.eq(SysDictInfo::getKwKey, querySysDictDto.getKwKey());
        }
        if (StringUtils.isNotBlank(querySysDictDto.getTypeKey())) {
            queryWrapper.eq(SysDictInfo::getTypeKey, querySysDictDto.getTypeKey());
        }
        if (StringUtils.isNotBlank(querySysDictDto.getTypeName())) {
            queryWrapper.eq(SysDictInfo::getTypeName, querySysDictDto.getTypeName());
        }
        List<SysDictInfo> sysDictInfoList = sysDictInfoService.list(queryWrapper);
        return R.ok(sysDictInfoList);
    }

}
