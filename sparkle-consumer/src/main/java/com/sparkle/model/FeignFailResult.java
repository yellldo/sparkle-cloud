package com.sparkle.model;

import lombok.Data;

/**
 * ClassName : FeignFailResult<br>
 * Description : TODO<br>
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2020/7/27 18:31
 **/
@Data
public class FeignFailResult {

    private String message;

    private int status;
}
