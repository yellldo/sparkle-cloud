package com.sparkle.feign.user.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Getter;
import lombok.Setter;

/**
 * ClassName : QuerySysUserOut<br>
 * Description : QuerySysUserOut<br>
 *
 * @author : sj
 * @date : 2021/10/21
 */
@Setter
@Getter
public class QuerySysUserOut {

    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    private String userName;

    private String status;

    private String createTime;
}
