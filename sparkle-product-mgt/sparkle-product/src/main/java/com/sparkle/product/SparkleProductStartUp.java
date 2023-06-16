package com.sparkle.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName : SparkleProductStartUp<br>
 * Description : SparkleProductStartUp<br>
 *
 * @author : sj
 * @date : 2022/3/1
 */
@MapperScan("com.sparkle.product.mapper")
@SpringBootApplication
public class SparkleProductStartUp {

    public static void main(String[] args) {
        SpringApplication.run(SparkleProductStartUp.class, args);
    }
}
