package com.noma.ecarforfuture.controller;

import com.noma.ecarforfuture.model.EmissionPredictAll;
import com.noma.ecarforfuture.model.EmissionPredictEVA;
import com.noma.ecarforfuture.model.EmissionPredictEVB;
import com.noma.ecarforfuture.service.EmissionPredictAllService;
import com.noma.ecarforfuture.service.EmissionPredictEVAService;
import com.noma.ecarforfuture.service.EmissionPredictEVBService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000", "https://frontend-iter2.dhf1bimc2e9gn.amplifyapp.com/", "http://www.recyclenowinvictoria.ml"})
@RestController
@RequestMapping("/v1/api/predict")
public class EmissionPredictAllController {
    @Autowired
    private EmissionPredictAllService emissionPredictAllService;

    @Autowired
    private EmissionPredictEVAService emissionPredictEVAService;

    @Autowired
    private EmissionPredictEVBService emissionPredictEVBService;


    @GetMapping("findAll")
    @ApiOperation(value = "Get predict all emission each year")
    public List<EmissionPredictAll> findAllEmissionPredict(){
        List<EmissionPredictAll> list = emissionPredictAllService.list();
        return list;
    }

    @GetMapping("findEVA")
    @ApiOperation(value = "Get predict emission EVA each year")
    public List<EmissionPredictEVA> findAllEmissionPredictEVA(){
        List<EmissionPredictEVA> list = emissionPredictEVAService.list();
        return list;
    }

    @GetMapping("findEVB")
    @ApiOperation(value = "Get predict emission EVB each year")
    public List<EmissionPredictEVB> findAllEmissionPredictEVB(){
        List<EmissionPredictEVB> list = emissionPredictEVBService.list();
        return list;
    }



}
