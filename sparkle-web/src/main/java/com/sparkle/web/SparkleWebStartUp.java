package com.sparkle.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName : SparkleWebStartUp<br>
 * Description : SparkleWebStartUp<br>
 *
 * @author : sj
 * @date : 2022/3/1
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SparkleWebStartUp {

    public static void main(String[] args) {
        SpringApplication.run(SparkleWebStartUp.class, args);
    }
}
