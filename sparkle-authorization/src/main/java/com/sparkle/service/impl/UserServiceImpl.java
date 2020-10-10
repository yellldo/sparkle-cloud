package com.sparkle.service.impl;

import com.sparkle.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * ClassName : UserServiceImpl<br>
 * Description : TODO<br>
 * Company : rrtx
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2020/10/10 18:35
 **/
@Service
public class UserServiceImpl implements UserService {


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
