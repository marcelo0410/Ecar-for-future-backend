package com.noma.ecarforfuture.controller;

import com.noma.ecarforfuture.model.ECar;
import com.noma.ecarforfuture.service.ECarService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000", "https://frontend-iter2.dhf1bimc2e9gn.amplifyapp.com", "http://www.recyclenowinvictoria.ml"})
@RestController
@RequestMapping("/v1/api/ecar")
public class ECarController {

    @Autowired
    private ECarService eCarService;

    @GetMapping("findAll")
    @ApiOperation(value = "Get all the Ecars information")
    public List<ECar> findAllEcar(){
        List<ECar> list = eCarService.list();
        return list;
    }
}
