package com.sparkle.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sparkle.auth.entity.OauthUser;

/**
 * @author alex
 * @date 2020/08/11
 */
public interface OauthUserMapper extends BaseMapper<OauthUser> {

    OauthUser getUserByAccount(String account);
}
