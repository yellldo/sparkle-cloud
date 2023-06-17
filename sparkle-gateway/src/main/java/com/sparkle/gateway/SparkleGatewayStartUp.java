package com.sparkle.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * ClassName : SparkleGatewayStartUp<br>
 * Description : SparkleGatewayStartUp<br>
 *
 * @author : sj
 * @date : 2023/6/16
 */
@EnableFeignClients("com.sparkle.feign")
@EnableDiscoveryClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SparkleGatewayStartUp {

    public static void main(String[] args) {
        SpringApplication.run(SparkleGatewayStartUp.class, args);
    }
}
