package com.noma.ecarforfuture.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.noma.ecarforfuture.model.EmissionAll;
import com.noma.ecarforfuture.model.EmissionType;
import com.noma.ecarforfuture.service.EmissionAllService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
//@CrossOrigin(origins = {"http://localhost:3000", "https://frontend-iter2.dhf1bimc2e9gn.amplifyapp.com", "http://www.recyclenowinvictoria.ml"})
@RestController
@RequestMapping("/v1/api/emissionAll")
public class EmissionAllController {
    @Autowired
    private EmissionAllService emissionAllService;

    @GetMapping("findAll2")
    @ApiOperation(value = "Get emission each year")
    public List<EmissionAll> findAllEmissionType2(){
        List<EmissionAll> list = emissionAllService.list();
        return list;
    }

    @GetMapping("findAll")
    @ApiOperation(value = "Get emission each year")
    public List<EmissionAll> findAllEmissionType(){
        QueryWrapper<EmissionAll> wrapper = new QueryWrapper<>();
        wrapper.between("year", 2001, 2020);
        List<EmissionAll> emissionAllListList = emissionAllService.getBaseMapper().selectList(wrapper);
        return emissionAllListList;
    }


}
