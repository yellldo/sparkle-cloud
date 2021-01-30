package com.sparkle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * ClassName : SparkleProviderApplication<br>
 * Description : TODO<br>
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2020/7/9 15:23
 **/
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SparkleProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SparkleProviderApplication.class, args);
    }
}
