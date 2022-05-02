package com.noma.ecarforfuture.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "vehicle")
@TableName("veh_vic")
public class Vehicle {
    @ApiModelProperty(value = "year")
    @TableField("year")
    private Integer year;

    @ApiModelProperty(value = "count")
    @TableField("count")
    private Integer count;
}
