package com.sparkle.bill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName : SparkleBillStartUp<br>
 * Description : SparkleBillStartUp<br>
 *
 * @author : sj
 * @date : 2023/6/16
 */
@MapperScan("com.sparkle.bill.mapper")
@EnableDiscoveryClient
@SpringBootApplication
public class SparkleBillStartUp {

    public static void main(String[] args) {
        SpringApplication.run(SparkleBillStartUp.class, args);
    }
}
