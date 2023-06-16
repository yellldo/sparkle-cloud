package com.sparkle.adm.utils;

import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.RandomUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.RedisConnectionFailureException;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * ClassName : RedisUtil<br>
 * Description : redis 工具类<br>
 *
 * @author : sj
 * @version : 1.0.0 2021/8/6
 */
@Slf4j
public class RedisUtil {

    @Autowired
    private RedisTemplate redisTemplate;

    public void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    private final static Long TIME = 30L;


    /**
     * 判断key是否存在
     *
     * @param key
     * @return
     */
    public boolean hasKey(String key) {
        try {
            return redisTemplate.hasKey(key);
        } catch (RedisConnectionFailureException e) {
            log.error("连接redis异常", e);
            return false;
        }
    }

    /**
     * 删除缓存
     *
     * @param key 可以传一个值 或多个
     */
    public void del(String... key) {
        if (ArrayUtil.isNotEmpty(key)) {
            if (key.length == 1) {
                redisTemplate.delete(key[0]);
            } else {
                redisTemplate.delete(CollectionUtils.arrayToList(key));
            }
        }
    }

    /**
     * 普通缓存获取
     *
     * @param key 键
     * @return 值
     */
    public Object get(String key) {
        return key == null ? null : redisTemplate.opsForValue().get(key);
    }


    /**
     * set缓存放入 默认30分钟
     *
     * @param key   键
     * @param value 值
     * @return
     */
    public boolean set(String key, Object value) {
        try {
            long time = TIME + RandomUtil.randomLong(TIME);
            redisTemplate.opsForValue().set(key, value, time, TimeUnit.MINUTES);
            return true;
        } catch (RedisConnectionFailureException e) {
            log.error("连接redis异常", e);
            return false;
        }

    }

    /**
     * set缓存放入并设置时间
     *
     * @param key   键
     * @param value 值
     * @param time  时间
     * @return
     */
    public boolean set(String key, Object value, long time) {
        try {
            time = time + RandomUtil.randomLong(time);
            redisTemplate.opsForValue().set(key, value, time, TimeUnit.MINUTES);
            return true;
        } catch (RedisConnectionFailureException e) {
            log.error("连接redis异常", e);
            return false;
        }
    }

    /**
     * set缓存放入并设置时间
     *
     * @param key   键
     * @param value 值
     * @param time  时间
     * @return
     */
    public boolean set(String key, Object value, long time, TimeUnit timeUnit) {
        try {
            time = time + RandomUtil.randomLong(time);
            redisTemplate.opsForValue().set(key, value, time, timeUnit);
            return true;
        } catch (RedisConnectionFailureException e) {
            log.error("连接redis异常", e);
            return false;
        }
    }

    /**
     * key续约
     *
     * @param key
     * @param time
     * @param timeUnit
     * @return
     */
    public boolean expire(String key, long time, TimeUnit timeUnit) {
        time = time + RandomUtil.randomLong(time);
        return redisTemplate.expire(key, time, timeUnit);
    }

}
