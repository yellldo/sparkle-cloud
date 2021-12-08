package com.sparkle.user.rest;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sparkle.domain.TableResultResponse;
import com.sparkle.feign.user.dto.QuerySysUserDto;
import com.sparkle.feign.user.dto.QuerySysUserOut;
import com.sparkle.user.convert.SysUserConvert;
import com.sparkle.user.entity.SysUser;
import com.sparkle.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName : SysUserCtrl<br>
 * Description : SysUserCtrl<br>
 *
 * @author : sj
 * @date : 2021/10/21
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserCtrl {

    @Autowired
    private SysUserService sysUserService;

    /**
     * 查询后台用户
     *
     * @return
     */
    @GetMapping("querySysUser")
    public TableResultResponse<QuerySysUserOut> querySysUser(QuerySysUserDto querySysUserDto) {
        List<QuerySysUserOut> result = new ArrayList<>();
        Page<SysUser> page = new Page<>(querySysUserDto.getPageNum(), querySysUserDto.getPageSize());
        LambdaQueryWrapper<SysUser> queryWrapper = new LambdaQueryWrapper<>();
        if (StrUtil.isNotEmpty(querySysUserDto.getUserName())) {
            queryWrapper.like(SysUser::getUserName, querySysUserDto.getUserName());
        }
        IPage<SysUser> iPage = sysUserService.page(page, queryWrapper);
        iPage.getRecords().forEach(sysUser -> {
            QuerySysUserOut querySysUserOut = SysUserConvert.INSTANCE.entity2Dto(sysUser);
            result.add(querySysUserOut);
        });
        return new TableResultResponse(page.getTotal(), result);
    }

}
