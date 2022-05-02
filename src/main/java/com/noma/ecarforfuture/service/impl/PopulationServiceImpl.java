package com.noma.ecarforfuture.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.noma.ecarforfuture.mapper.PopulationMapper;
import com.noma.ecarforfuture.model.Population;
import com.noma.ecarforfuture.service.PopulationService;
import org.springframework.stereotype.Service;

@Service
public class PopulationServiceImpl extends ServiceImpl<PopulationMapper, Population> implements PopulationService {
}
