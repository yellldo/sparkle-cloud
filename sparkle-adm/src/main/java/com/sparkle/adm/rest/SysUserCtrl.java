package com.sparkle.adm.rest;

import com.sparkle.adm.dto.SysLoginDto;
import com.sparkle.domain.R;
import com.sparkle.feign.user.dto.SysUserRegisterDto;
import com.sparkle.feign.user.service.SysUserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName : SysUserCtrl<br>
 * Description : SysUserCtrl<br>
 *
 * @author : sj
 * @date : 2023/6/16
 */
@RestController
@RequestMapping("sysUser")
public class SysUserCtrl {

    @Autowired
    private SysUserServiceFeign sysUserServiceFeign;

    /**
     * @return
     */
    @PostMapping("login")
    public R login(@RequestBody SysLoginDto sysLoginDto) {
        return R.ok();
    }


    @PostMapping("register")
    public R register(@RequestBody SysUserRegisterDto sysUserRegisterDto) {
        sysUserServiceFeign.register(sysUserRegisterDto);
        return R.ok();

    }

}

