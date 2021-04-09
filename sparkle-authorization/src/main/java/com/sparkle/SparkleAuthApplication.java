package com.sparkle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * ClassName : SparkleAuthApplication<br>
 * Description : SparkleAuthApplication<br>
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2021/4/8
 */
@SpringBootApplication
@EnableEurekaClient
@EnableAuthorizationServer
public class SparkleAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SparkleAuthApplication.class, args);
    }

}
