package com.sparkle.merchant.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName : IdConfig<br>
 * Description : IdConfig<br>
 *
 * @author : sj
 * @date : 2022-11-22
 */
@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "id")
public class IdConfig {

    private Long workerId;

    private Long datacenterId;
}
