package com.sparkle.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * ClassName : TestFeignClient<br>
 * Description : TODO<br>
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2020/7/9 17:05
 **/
@FeignClient("sparkle-provider")
public interface TestFeignClient {


    @PostMapping("/test/")
    void test();
}
