package com.sparkle.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * ClassName : SparkleGatewayStartUp<br>
 * Description : SparkleGatewayStartUp<br>
 *
 * @author : sj
 * @date : 2023/6/16
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SparkleGatewayStartUp {

    public static void main(String[] args) {
        SpringApplication.run(SparkleGatewayStartUp.class, args);
    }
}
