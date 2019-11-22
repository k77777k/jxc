package com.wf.controller;

import com.wf.pojo.Detail;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/api")
@Api(tags = {"为了测试Swagger"})
public class TestController {

    @ApiIgnore
    @GetMapping("/test")
    @ApiOperation(value = "测试Swagger的方法")
    public String test(String echo){

        return "String"+echo;
    }
    @PostMapping("/detail")
    @ApiOperation(value = "测试实体类接收参数")
    public Detail detail(@RequestBody Detail detail){
        return detail;

    }}
