package com.sparkle.base.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sparkle.base.entity.Company;
import com.sparkle.base.service.CompanyService;
import com.sparkle.base.mapper.CompanyMapper;
import org.springframework.stereotype.Service;

/**
 * @author shenjia
 * @description 针对表【company(公司-公司背景-基本信息)】的数据库操作Service实现
 * @createDate 2021-12-07 23:27:59
 */
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company>
        implements CompanyService {

}




