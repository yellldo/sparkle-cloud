package com.sparkle.adm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName : SparkleAdmStartUp<br>
 * Description : SparkleAdmStartUp<br>
 *
 * @author : sj
 * @date : 2023/6/16
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SparkleAdmStartUp {

    public static void main(String[] args) {
        SpringApplication.run(SparkleAdmStartUp.class, args);
    }
}

