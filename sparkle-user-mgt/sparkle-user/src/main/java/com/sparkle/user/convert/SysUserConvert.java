package com.sparkle.user.convert;

import com.sparkle.feign.user.dto.QuerySysUserOut;
import com.sparkle.user.entity.SysUser;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * ClassName : SysUserConvert<br>
 * Description : SysUserConvert<br>
 *
 * @author : sj
 * @date : 2021/10/21
 */
@Mapper
public interface SysUserConvert {

    SysUserConvert INSTANCE = Mappers.getMapper(SysUserConvert.class);

    /**
     * 实体转dto
     *
     * @param sysUser
     * @return
     */
    QuerySysUserOut entity2Dto(SysUser sysUser);

}
