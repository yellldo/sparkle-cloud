package com.sparkle.adm.config;

import com.sparkle.adm.utils.RedisUtil;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * ClassName : RedisConfig<br>
 * Description : redis 配置<br>
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2021/7/23
 */
@Configuration
public class RedisConfig {

    @Bean
    @ConditionalOnClass(RedisOperations.class)
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(factory);
        // key采用 String的序列化方式
        template.setKeySerializer(new StringRedisSerializer());
        // hash的 key也采用 String的序列化方式
        template.setHashKeySerializer(new StringRedisSerializer());
        // value序列化方式采用 jackson
        template.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        // hash的 value序列化方式采用 jackson
        template.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());
        // 开启事务
        template.setEnableTransactionSupport(true);
        return template;
    }


    /**
     * 注入封装RedisTemplate
     *
     * @param redisTemplate
     */
    @Bean(name = "redisUtil")
    public RedisUtil redisUtil(RedisTemplate<String, Object> redisTemplate) {
        RedisUtil redisUtil = new RedisUtil();
        redisUtil.setRedisTemplate(redisTemplate);
        return redisUtil;
    }

}
