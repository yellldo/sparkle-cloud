package com.sh.sparkle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * ClassName : com.sh.sparkle.MqExerciseApplication<br>
 * Description : <br>
 * Company : rrtx
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2020/11/6
 **/
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MqExerciseApplication {

    public static void main(String[] args) {
        SpringApplication.run(MqExerciseApplication.class, args);
    }
}
