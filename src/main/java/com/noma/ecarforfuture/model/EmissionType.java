package com.noma.ecarforfuture.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "EmissionType")
@TableName("emission_types")
public class EmissionType {
    @ApiModelProperty(value = "year")
    @TableField("year")
    private Integer year;

    @ApiModelProperty(value = "electricity")
    @TableField("electricity")
    private Double electricity;

    @ApiModelProperty(value = "stationary_energy")
    @TableField("stationary_energy")
    private Double stationaryEnergy;

    @ApiModelProperty(value = "transport")
    @TableField("transport")
    private Double transport;

    @ApiModelProperty(value = "fugitive_emissions")
    @TableField("fugitive_emissions")
    private Double fugitiveEmissions;

    @ApiModelProperty(value = "industrial_processes_and_product_use")
    @TableField("industrial_processes_and_product_use")
    private Double industrialProcessesAndProductUse;

    @ApiModelProperty(value = "agriculture")
    @TableField("agriculture")
    private Double agriculture;

    @ApiModelProperty(value = "waste")
    @TableField("waste")
    private Double waste;

    @ApiModelProperty(value = "LULUCF")
    @TableField("LULUCF")
    private Double lulucf;

    @ApiModelProperty(value = "total")
    @TableField("total")
    private Double total;
}
