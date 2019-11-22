package com.wf.controller;

import com.alibaba.druid.util.StringUtils;
import com.wf.exception.JxcException;
import com.wf.pojo.User;
import com.wf.service.UserService;
import com.wf.utils.ResultVOUtil;
import com.wf.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
@Api(tags = "用户模块的controller")
@CrossOrigin
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/doLogin")
    @ApiOperation(value = "用户登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username",value = "用户名"),
            @ApiImplicitParam(name = "password",value = "密码")
    })
    public ResultVO login(String username, String password, @ApiIgnore HttpSession httpSession){
        //先判断参数是否合法
        if(StringUtils.isEmpty(username)||StringUtils.isEmpty(password)){
            //TODO 参数不合法
            throw new JxcException(12, "参数不合法");
        }
        //调用service执行登录
        User user = userService.login(username, password);
        //登录成功
        httpSession.setAttribute("user", user);
        ResultVO resultVO = ResultVOUtil.success();
        return resultVO;
    }
}
