package com.sparkle.feign.user.dto;

import com.sparkle.domain.QueryRequest;
import lombok.Data;

/**
 * ClassName : QuerySysUserDto<br>
 * Description : QuerySysUserDto<br>
 *
 * @author : sj
 * @date : 2021/10/21
 */
@Data
public class QuerySysUserDto extends QueryRequest {

    private String userName;
}
