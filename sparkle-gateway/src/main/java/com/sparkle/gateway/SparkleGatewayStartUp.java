package com.sparkle.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ClassName : SparkleGatewayStartUp<br>
 * Description : SparkleGatewayStartUp<br>
 *
 * @author : sj
 * @date : 2021/10/21
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SparkleGatewayStartUp {

    public static void main(String[] args) {
        SpringApplication.run(SparkleGatewayStartUp.class, args);
    }
}
