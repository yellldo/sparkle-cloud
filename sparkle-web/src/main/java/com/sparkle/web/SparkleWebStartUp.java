package com.sparkle.web;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName : SparkleWebStartUp<br>
 * Description : SparkleWebStartUp<br>
 *
 * @author : sj
 * @date : 2022/3/1
 */
@EnableDubbo
@EnableDiscoveryClient
@SpringBootApplication
public class SparkleWebStartUp {

    public static void main(String[] args) {
        SpringApplication.run(SparkleWebStartUp.class, args);
    }
}
