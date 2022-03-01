package com.sparkle.base.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sparkle.base.entity.AreaCode;
import com.sparkle.base.service.AreaCodeService;
import com.sparkle.base.mapper.AreaCodeMapper;
import org.springframework.stereotype.Service;

/**
 * @author shenjia
 * @description 针对表【area_code(字典表-行政区划码)】的数据库操作Service实现
 * @createDate 2022-03-01 14:07:58
 */
@Service
public class AreaCodeServiceImpl extends ServiceImpl<AreaCodeMapper, AreaCode>
        implements AreaCodeService {

}




