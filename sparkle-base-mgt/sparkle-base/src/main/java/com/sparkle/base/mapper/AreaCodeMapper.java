package com.sparkle.base.mapper;

import com.sparkle.base.entity.AreaCode;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author shenjia
 * @description 针对表【area_code(字典表-行政区划码)】的数据库操作Mapper
 * @createDate 2022-03-01 14:07:58
 * @Entity com.sparkle.base.entity.AreaCode
 */
@Mapper
public interface AreaCodeMapper extends BaseMapper<AreaCode> {

}




