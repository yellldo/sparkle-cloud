package com.sparkle.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

/**
 * ClassName : ResourceServerConfig<br>
 * Description : 资源配置<br>
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2021/4/8
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        super.configure(resources);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.requestMatchers()
                .antMatchers("").and()
                .authorizeRequests().anyRequest().authenticated()
                .and().authorizeRequests()
                .antMatchers("").access("")
                .antMatchers("").access("");
    }
}
