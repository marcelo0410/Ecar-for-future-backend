package com.noma.ecarforfuture.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "EmissionPredictEVA")
@TableName("emission_predict_eva")
public class EmissionPredictEVA {
    @ApiModelProperty(value = "year")
    @TableField("year")
    private Integer year;

    @ApiModelProperty(value = "emission")
    @TableField("emission")
    private Long emission;
}
