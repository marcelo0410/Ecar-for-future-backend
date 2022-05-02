package com.noma.ecarforfuture.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "pop_vic")
@TableName("pop_vic")
public class Population {
    @ApiModelProperty(value = "year")
    @TableField("year")
    private Integer year;

    @ApiModelProperty(value = "population")
    @TableField("population")
    private Integer population;
}
