package com.sparkle.merchant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.swing.*;

/**
 * ClassName : SparkleMerchantStartUp<br>
 * Description : SparkleMerchantStartUp<br>
 *
 * @author : sj
 * @date : 2023/6/16
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SparkleMerchantStartUp {

    public static void main(String[] args) {
        SpringApplication.run(SparkleMerchantStartUp.class, args);
    }
}
