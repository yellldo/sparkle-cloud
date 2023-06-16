package com.sparkle.adm.dto;

import com.sparkle.domain.BaseDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * ClassName : SysLoginDto<br>
 * Description : SysLoginDto<br>
 *
 * @author : sj
 * @date : 2023/6/16
 */
@Setter
@Getter
@ToString
@ApiModel
public class SysLoginDto extends BaseDto {

    @ApiModelProperty("账号")
    private String loginName;

    @ApiModelProperty("密码")
    private String password;
}
