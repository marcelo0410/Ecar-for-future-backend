package com.noma.ecarforfuture.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.noma.ecarforfuture.mapper.VehicleMapper;
import com.noma.ecarforfuture.model.Vehicle;
import com.noma.ecarforfuture.service.VehicleService;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl extends ServiceImpl<VehicleMapper, Vehicle> implements VehicleService {
}
