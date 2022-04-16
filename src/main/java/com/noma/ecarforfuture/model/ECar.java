package com.noma.ecarforfuture.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(description = "EV")
@TableName("test_table")
public class ECar implements Serializable {


    @ApiModelProperty(value = "EV Id")
    @TableField("id")
    private Integer id;

    @ApiModelProperty(value = "EV name")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "EV color")
    @TableField("color")
    private String color;

    @ApiModelProperty(value = "EV power")
    @TableField("power")
    private Integer power;

    @ApiModelProperty(value = "EV battery")
    @TableField("battery_capacity")
    private Double battery;

    @ApiModelProperty(value = "EV brand")
    @TableField("brand")
    private String brand;
}
