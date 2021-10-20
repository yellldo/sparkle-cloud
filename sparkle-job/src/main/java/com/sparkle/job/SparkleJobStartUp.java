package com.sparkle.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName : SparkleJobStartUp<br>
 * Description : SparkleJobStartUp<br>
 *
 * @author : sj
 * @date : 2021/10/21
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SparkleJobStartUp {

    public static void main(String[] args) {
        SpringApplication.run(SparkleJobStartUp.class, args);
    }
}
