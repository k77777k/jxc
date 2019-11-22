package com.wf.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Api(tags = {"为了测试Swagger"})
public class TestController {

    @RequestMapping("/test")
    @ApiOperation(value = "测试Swagger的方法")
    public String test(String echo){

        return "String"+echo;
    }
}
