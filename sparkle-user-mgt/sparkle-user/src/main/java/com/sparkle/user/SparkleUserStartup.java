package com.sparkle.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName : SparkleUserStartup<br>
 * Description : SparkleUserStartup<br>
 *
 * @author : sj
 * @date : 2023/6/16
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SparkleUserStartup {

    public static void main(String[] args) {
        SpringApplication.run(SparkleUserStartup.class, args);
    }
}

