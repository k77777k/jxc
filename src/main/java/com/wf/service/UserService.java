package com.wf.service;

import com.wf.pojo.User;

public interface UserService {
    //登录
    User login(String username,String password);
}
