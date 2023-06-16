package com.sparkle.user.rest;

import com.sparkle.domain.R;
import com.sparkle.feign.user.dto.SysUserRegisterDto;
import com.sparkle.feign.user.service.SysUserServiceFeign;
import com.sparkle.user.biz.SysUserBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName : SysUserCtrl<br>
 * Description : SysUserCtrl<br>
 *
 * @author : sj
 * @date : 2023/6/16
 */
@RestController
public class SysUserCtrl implements SysUserServiceFeign {

    @Autowired
    private SysUserBiz sysUserBiz;


    @Override
    public R register(SysUserRegisterDto sysUserRegisterDto) {
        sysUserBiz.register(sysUserRegisterDto);
        return R.ok();
    }
}
