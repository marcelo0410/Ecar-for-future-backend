package com.noma.ecarforfuture.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "EmissionPredictAll")
@TableName("emission_predict_all")
public class EmissionPredictAll {
    @ApiModelProperty(value = "year")
    @TableField("year")
    private Integer year;

    @ApiModelProperty(value = "emission")
    @TableField("emission")
    private Integer emission;

    @ApiModelProperty(value = "emissionFifty")
    @TableField("emission_fifty")
    private Integer emissionFifty;

    @ApiModelProperty(value = "difference")
    @TableField("difference")
    private Integer difference;
}
