package com.sparkle.adm.rest;

import com.alibaba.fastjson.JSON;
import com.sparkle.feign.user.dto.SysUserRegisterDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * ClassName : SysUserCtrlTest<br>
 * Description : SysUserCtrlTest<br>
 *
 * @author : sj
 * @date : 2023/6/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SysUserCtrlTest {

    @Autowired
    private WebApplicationContext wac;
    private MockMvc mvc;

    @Before
    public void setUp() {
        mvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }


    @Test
    public void register() throws Exception {
        SysUserRegisterDto registerDto = new SysUserRegisterDto();
        registerDto.setLoginName("17600907051");
        registerDto.setRoleId(0L);
        mvc.perform(MockMvcRequestBuilders.post("/adm/sysUser/register")
                .contentType(MediaType.APPLICATION_JSON)
                .content(JSON.toJSONString(registerDto))
                .accept(MediaType.APPLICATION_JSON_UTF8_VALUE)).andDo(print());
    }
}
