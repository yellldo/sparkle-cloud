package com.sparkle.auth.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sparkle.auth.entity.OauthUserRole;
import com.sparkle.auth.mapper.OauthUserRoleMapper;
import org.springframework.stereotype.Service;

/**
 * @author alex
 * @date 2020/08/11
 */
@Service
public class OauthUserRoleService extends ServiceImpl<OauthUserRoleMapper, OauthUserRole> {
}
