package com.sparkle.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sparkle.user.entity.SysMessage;
import com.sparkle.user.service.SysMessageService;
import com.sparkle.user.mapper.SysMessageMapper;
import org.springframework.stereotype.Service;

/**
 * @author shenjia
 * @description 针对表【sys_message(消息表)】的数据库操作Service实现
 * @createDate 2023-06-16 15:03:11
 */
@Service
public class SysMessageServiceImpl extends ServiceImpl<SysMessageMapper, SysMessage>
        implements SysMessageService {

}




