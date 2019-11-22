package com.wf.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "测试的实体类，描述xxx")
public class Detail {

    @ApiModelProperty(value = "表的主键id")
    private Integer id;
    @ApiModelProperty(value = "xxx的名称")
    private String name;
    @ApiModelProperty(value = "xxx的年龄")
    private Integer age;

}
