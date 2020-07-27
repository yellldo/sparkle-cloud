package com.sparkle.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeignFailResult {

    private String message;

    private int status;
}
