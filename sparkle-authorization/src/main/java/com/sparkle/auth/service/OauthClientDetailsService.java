package com.sparkle.auth.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sparkle.auth.adapter.ClientDetailsAdapter;
import com.sparkle.auth.entity.OauthClientDetails;
import com.sparkle.auth.mapper.OauthClientDetailsMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * ClassName : OauthClientDetailsServiceImpl<br>
 * Description : 第三方接入应用service层<br>
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2021/4/14
 */
@Slf4j
@Service("oauthClientDetailsService")
public class OauthClientDetailsService extends ServiceImpl<OauthClientDetailsMapper, OauthClientDetails> implements ClientDetailsService {

    @Resource
    private RedisTemplate<String, OauthClientDetails> redisTemplate;
    private String prefix = "ClientDetails:";

    @Override
    public ClientDetails loadClientByClientId(String s) throws ClientRegistrationException {
        OauthClientDetails oauthClientDetails = redisTemplate.opsForValue().get(prefix + s);
        if (oauthClientDetails == null) {
            LambdaQueryWrapper<OauthClientDetails> queryWrapper = new LambdaQueryWrapper();
            queryWrapper.eq(OauthClientDetails::getAppKey, s);
            oauthClientDetails = super.getOne(queryWrapper);
            if (oauthClientDetails == null) {
                return null;
            }
            redisTemplate.opsForValue().set(prefix + s, oauthClientDetails, 1, TimeUnit.HOURS);
        }
        return new ClientDetailsAdapter(oauthClientDetails);
    }
}
