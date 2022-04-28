package com.noma.ecarforfuture.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.noma.ecarforfuture.mapper.EmissionTypeMapper;
import com.noma.ecarforfuture.model.EmissionType;
import com.noma.ecarforfuture.service.EmissionTypeService;
import org.springframework.stereotype.Service;

@Service
public class EmissionTypeServiceImpl extends ServiceImpl<EmissionTypeMapper, EmissionType> implements EmissionTypeService {
}
