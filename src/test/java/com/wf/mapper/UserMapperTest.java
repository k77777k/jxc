package com.wf.mapper;

import com.wf.JxcApplicationTests;
import com.wf.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class UserMapperTest extends JxcApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        User user = new User();
        user.setUsername("zhangsan");
        User user1 = userMapper.selectOne(user);
        System.out.println(user1);
    }

}