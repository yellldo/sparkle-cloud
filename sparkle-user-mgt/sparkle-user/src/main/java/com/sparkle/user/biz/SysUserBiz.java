package com.sparkle.user.biz;

import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.sparkle.constants.CommonConstant;
import com.sparkle.exception.base.BusinessException;
import com.sparkle.feign.user.dto.SysUserRegisterDto;
import com.sparkle.user.config.IdConfig;
import com.sparkle.user.entity.SysUser;
import com.sparkle.user.service.SysUserService;
import com.sparkle.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName : SysUserBiz<br>
 * Description : SysUserBiz<br>
 *
 * @author : sj
 * @date : 2023/6/16
 */
@Service
public class SysUserBiz {

    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private IdConfig idConfig;

    public void register(SysUserRegisterDto sysUserRegisterDto) {
        LambdaQueryWrapper<SysUser> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(SysUser::getLoginName, sysUserRegisterDto.getLoginName());
        int count = sysUserService.count(queryWrapper);
        if (count > 0) {
            throw new BusinessException("账户已存在");
        }
        SysUser sysUser = new SysUser();
        sysUser.setUserId(IdUtil.getSnowflake(idConfig.getWorkerId(), idConfig.getDatacenterId()).nextId());
        sysUser.setLoginName(sysUserRegisterDto.getLoginName());
        sysUser.setNickName(sysUserRegisterDto.getNickName());
        sysUser.setPassword(MD5.md5(MD5.md5(CommonConstant.COMMON_PWD) + sysUserRegisterDto.getLoginName()));
        sysUser.setRoleId(sysUserRegisterDto.getRoleId());
        sysUserService.save(sysUser);
    }
}
