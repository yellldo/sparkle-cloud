package com.sparkle.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName : SparkleUserStartUp<br>
 * Description : SparkleUserStartUp<br>
 *
 * @author : sj
 * @date : 2021/10/20
 */
@MapperScan({"com.sparkle.user.mapper"})
@EnableDiscoveryClient
@SpringBootApplication
public class SparkleUserStartUp {

    public static void main(String[] args) {
        SpringApplication.run(SparkleUserStartUp.class, args);
    }
}
