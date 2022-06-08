package com.noma.ecarforfuture.controller;

import com.noma.ecarforfuture.model.EVCarDetail;
import com.noma.ecarforfuture.model.EmissionType;
import com.noma.ecarforfuture.service.EVCarDetailService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/v1/api/evDetail")
public class EVCarDetailController {

    @Autowired
    private EVCarDetailService evCarDetailService;

    @GetMapping("findAll")
    @ApiOperation(value = "Get all the EV cars' spec")
    public List<EVCarDetail> findAllEVCarDetail(){
        List<EVCarDetail> list = evCarDetailService.list();
        return list;
    }
}
