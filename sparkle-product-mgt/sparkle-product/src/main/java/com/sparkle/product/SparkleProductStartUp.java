package com.sparkle.product;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName : SparkleProductStartUp<br>
 * Description : SparkleProductStartUp<br>
 *
 * @author : sj
 * @date : 2022/3/1
 */
@EnableDubbo
@MapperScan("com.sparkle.product.mapper")
@EnableDiscoveryClient
@SpringBootApplication
public class SparkleProductStartUp {

    public static void main(String[] args) {
        SpringApplication.run(SparkleProductStartUp.class, args);
    }
}
