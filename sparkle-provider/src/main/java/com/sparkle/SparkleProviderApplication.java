package com.sparkle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ClassName : SparkleProviderApplication<br>
 * Description : TODO<br>
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2020/7/9 15:23
 **/
@SpringBootApplication
@EnableEurekaClient
public class SparkleProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SparkleProviderApplication.class, args);
    }
}
