package com.sparkle.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName : SparkleServiceStartup<br>
 * Description : SparkleServiceStartup<br>
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2021/5/19
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SparkleServiceStartup {

    public static void main(String[] args) {
        SpringApplication.run(SparkleServiceStartup.class, args);
    }
}
