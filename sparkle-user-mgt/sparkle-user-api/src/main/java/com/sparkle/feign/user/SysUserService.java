package com.sparkle.feign.user;

import com.sparkle.domain.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName : SysUserService<br>
 * Description : SysUserService<br>
 *
 * @author : sj
 * @date : 2021/10/21
 */
@FeignClient(value = "sparkle-user", path = "sparkle-user")
public interface SysUserService {

    /**
     * 查询后台用户
     *
     * @return
     */
    @GetMapping("sysUser/querySysUser")
    R querySysUser();

}
