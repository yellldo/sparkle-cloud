package com.sparkle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ClassName : SparkleConsumerApplication<br>
 * Description : TODO<br>
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2020/7/9 16:57
 **/
@SpringBootApplication(scanBasePackages = "com.sparkle", exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@EnableFeignClients
public class SparkleConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SparkleConsumerApplication.class, args);
    }
}
