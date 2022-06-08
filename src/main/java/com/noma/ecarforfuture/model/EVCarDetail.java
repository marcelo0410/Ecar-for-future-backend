package com.noma.ecarforfuture.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "ev_car_detail")
@TableName("ev_details")
public class EVCarDetail {

    @ApiModelProperty(value = "ev_id")
    @TableField("ev_id")
    private Integer evId;

    @ApiModelProperty(value = "ev_brand")
    @TableField("ev_brand")
    private String evBrand;

    @ApiModelProperty(value = "ev_type")
    @TableField("ev_type")
    private String evType;

    @ApiModelProperty(value = "ev_budget")
    @TableField("ev_budget")
    private Integer evBudget;

    @ApiModelProperty(value = "ev_distance")
    @TableField("ev_distance")
    private Integer evDistance;

    @ApiModelProperty(value = "ev_battery")
    @TableField("ev_battery")
    private Integer evBattery;

    @ApiModelProperty(value = "ev_energy")
    @TableField("ev_energy")
    private Integer evEnergy;

    @ApiModelProperty(value = "link")
    @TableField("link")
    private String link;


    @ApiModelProperty(value = "img_link")
    @TableField("img_link")
    private String imgLink;


}
