package com.sparkle.auth.config;

import com.sparkle.auth.handler.OauthUserApprovalHandler;
import com.sparkle.auth.handler.OauthWebResponseExceptionTranslator;
import com.sparkle.auth.service.OauthClientDetailsService;
import com.sparkle.auth.service.OauthCodeService;
import com.sparkle.auth.service.OauthUserDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.OAuth2RequestFactory;
import org.springframework.security.oauth2.provider.approval.UserApprovalHandler;
import org.springframework.security.oauth2.provider.request.DefaultOAuth2RequestFactory;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

/**
 * ClassName : AuthorizationServerConfig<br>
 * Description : 认证服务器配置<br>
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2021/4/14
 */
@Slf4j
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private RedisConnectionFactory redisConnectionFactory;

    @Autowired
    private OauthClientDetailsService oauthClientDetailService;

    @Autowired
    private OauthCodeService authorizationCodeServices;

    @Autowired
    private OauthUserDetailService userDetailService;

    @Autowired
    private OauthWebResponseExceptionTranslator oauthWebResponseExceptionTranslator;


    @Bean
    public TokenStore tokenStore() {
        final RedisTokenStore redisTokenStore = new RedisTokenStore(redisConnectionFactory);
        redisTokenStore.setPrefix("TOKEN:");
        redisTokenStore.setSerializationStrategy(new FastJsonRedisTokenStoreSerializationStrategy());
        return new RedisTokenStore(redisConnectionFactory);
    }

    /**
     * 定义令牌端点上的安全性约束
     *
     * @param security
     * @throws Exception
     */
    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security
                .allowFormAuthenticationForClients()
                .tokenKeyAccess("permitAll()").checkTokenAccess("permitAll()");
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.withClientDetails(oauthClientDetailService);
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.tokenStore(tokenStore())
                .allowedTokenEndpointRequestMethods(HttpMethod.GET, HttpMethod.POST)
                // 自定义认证异常处理
                .exceptionTranslator(oauthWebResponseExceptionTranslator)
                // 用户信息service
                .userDetailsService(userDetailService)
                // 自定义的授权码模式的code（授权码）处理，使用redis存储
                .authorizationCodeServices(authorizationCodeServices)
                // 注入authenticationManager来支持password模式
                .authenticationManager(authenticationManager);
    }


    @Bean
    public OAuth2RequestFactory oAuth2RequestFactory() {
        return new DefaultOAuth2RequestFactory(oauthClientDetailService);
    }

    @Bean
    public UserApprovalHandler userApprovalHandler() {
        OauthUserApprovalHandler userApprovalHandler = new OauthUserApprovalHandler();
        userApprovalHandler.setTokenStore(tokenStore());
        userApprovalHandler.setClientDetailsService(oauthClientDetailService);
        userApprovalHandler.setRequestFactory(oAuth2RequestFactory());
        return userApprovalHandler;
    }
}

