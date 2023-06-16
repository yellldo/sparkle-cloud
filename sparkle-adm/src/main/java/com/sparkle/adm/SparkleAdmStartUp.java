package com.sparkle.adm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * ClassName : SparkleAdmStartUp<br>
 * Description : SparkleAdmStartUp<br>
 *
 * @author : sj
 * @date : 2023/6/16
 */
@ComponentScan("com.sparkle.feign")
@EnableDiscoveryClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SparkleAdmStartUp {

    public static void main(String[] args) {
        SpringApplication.run(SparkleAdmStartUp.class, args);
    }
}

