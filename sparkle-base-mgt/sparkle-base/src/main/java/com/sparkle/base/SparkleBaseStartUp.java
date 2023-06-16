package com.sparkle.base;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName : SparkleBaseStartUp<br>
 * Description : SparkleBaseStartUp<br>
 *
 * @author : sj
 * @date : 2022/3/1
 */
@EnableDiscoveryClient
@MapperScan("com.sparkle.base.mapper")
@SpringBootApplication
public class SparkleBaseStartUp {

    public static void main(String[] args) {
        SpringApplication.run(SparkleBaseStartUp.class, args);
    }
}
