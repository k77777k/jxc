package com.wf.service;

import com.wf.JxcApplicationTests;
import com.wf.pojo.User;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest extends JxcApplicationTests {

    @Resource
    private UserService userService;

    @Test
    void login() {
        User zhangsan = userService.login("zhangsan", "123123");
        System.out.println(zhangsan);
    }
}