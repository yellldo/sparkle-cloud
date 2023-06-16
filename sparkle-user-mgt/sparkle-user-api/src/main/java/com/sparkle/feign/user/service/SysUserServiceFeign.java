package com.sparkle.feign.user.service;

import com.sparkle.domain.R;
import com.sparkle.feign.user.dto.SysUserRegisterDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * ClassName : SysUserServiceFeign<br>
 * Description : SysUserServiceFeign<br>
 *
 * @author : sj
 * @date : 2023/6/16
 */
@FeignClient("sparkle-user")
public interface SysUserServiceFeign {


    @PostMapping("/sysUser/register")
    public R register(@RequestBody SysUserRegisterDto sysUserRegisterDto);


}
