package com.wf.service.impl;

import com.wf.exception.JxcException;
import com.wf.mapper.UserMapper;
import com.wf.pojo.User;
import com.wf.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        User user = new User();
        user.setUsername(username);
        User user1 = userMapper.selectOne(user);
        if(user1==null){
            // TODO 用户名错误
            throw new JxcException(10,"用户名错误");
        }
        if(!user1.getPassword().equals(password)){
            // TODO 密码不正确
            throw new JxcException(11, "密码不正确");
        }
        //登录成功
        return user1;
    }
}
