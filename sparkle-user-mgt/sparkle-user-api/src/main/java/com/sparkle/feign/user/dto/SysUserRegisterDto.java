package com.sparkle.feign.user.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * ClassName : SysUserRegisterDto<br>
 * Description : SysUserRegisterDto<br>
 *
 * @author : sj
 * @date : 2023/6/16
 */
@Setter
@Getter
@ToString
public class SysUserRegisterDto {

    private String loginName;

    private String nickName;

    private Long roleId;
}
