package com.noma.ecarforfuture.controller;

import com.noma.ecarforfuture.model.EmissionType;
import com.noma.ecarforfuture.model.Population;
import com.noma.ecarforfuture.service.PopulationService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/v1/api/pop")
public class PopulationController {
    @Autowired
    PopulationService populationService;

    @GetMapping("findAll")
    @ApiOperation(value = "Get all the Population information")
    public List<Population> findAllEmissionType(){
        List<Population> list = populationService.list();
        return list;
    }
}
