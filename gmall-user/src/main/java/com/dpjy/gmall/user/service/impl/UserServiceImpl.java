package com.dpjy.gmall.user.service.impl;

import com.dpjy.gmall.user.mapper.UserMapper;
import com.dpjy.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
}
