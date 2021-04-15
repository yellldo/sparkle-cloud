package com.sparkle.auth.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sparkle.auth.entity.OauthRole;
import com.sparkle.auth.mapper.OauthRoleMapper;
import org.springframework.stereotype.Service;

/**
 * @author alex
 * @date 2020/08/11
 */
@Service
public class OauthRoleService extends ServiceImpl<OauthRoleMapper, OauthRole> {
}
