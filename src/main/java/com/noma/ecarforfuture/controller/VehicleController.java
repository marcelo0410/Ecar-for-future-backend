package com.noma.ecarforfuture.controller;

import com.noma.ecarforfuture.model.Population;
import com.noma.ecarforfuture.model.Vehicle;
import com.noma.ecarforfuture.service.PopulationService;
import com.noma.ecarforfuture.service.VehicleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/v1/api/veh")
public class VehicleController {
    @Autowired
    VehicleService vehicleService;

    @GetMapping("findAll")
    @ApiOperation(value = "Get all the vehicle information")
    public List<Vehicle> findAllEmissionType(){
        List<Vehicle> list = vehicleService.list();
        return list;
    }
}
