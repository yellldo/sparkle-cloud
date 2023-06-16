package com.sparkle.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sparkle.user.entity.SysUser;
import com.sparkle.user.service.SysUserService;
import com.sparkle.user.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

/**
 * @author shenjia
 * @description 针对表【sys_user(后台用户表)】的数据库操作Service实现
 * @createDate 2023-06-16 15:50:59
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
        implements SysUserService {

}




