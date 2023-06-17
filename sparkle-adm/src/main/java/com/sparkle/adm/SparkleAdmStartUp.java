package com.sparkle.adm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * ClassName : SparkleAdmStartUp<br>
 * Description : SparkleAdmStartUp<br>
 *
 * @author : sj
 * @date : 2023/6/16
 */
@EnableSwagger2
@EnableDiscoveryClient
@EnableFeignClients("com.sparkle.feign")
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class, scanBasePackages = "com.sparkle.adm")
public class SparkleAdmStartUp {

    public static void main(String[] args) {
        SpringApplication.run(SparkleAdmStartUp.class, args);
    }
}
