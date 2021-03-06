package com.sparkle.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName : SparkleWebStartup<br>
 * Description : TODO<br>
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2021/5/19
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SparkleWebStartup {
    public static void main(String[] args) {
        SpringApplication.run(SparkleWebStartup.class, args);
    }
}
