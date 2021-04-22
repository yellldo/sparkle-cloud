package com.sparkle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * ClassName : SparkleGateWayApplication<br>
 * Description : TODO<br>
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2020/7/9 17:17
 **/
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class SparkleGateWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SparkleGateWayApplication.class, args);
    }

}
