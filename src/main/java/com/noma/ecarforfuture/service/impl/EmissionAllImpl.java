package com.noma.ecarforfuture.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.noma.ecarforfuture.mapper.EmissionAllMapper;
import com.noma.ecarforfuture.model.EmissionAll;
import com.noma.ecarforfuture.service.EmissionAllService;
import org.springframework.stereotype.Service;

@Service
public class EmissionAllImpl extends ServiceImpl<EmissionAllMapper, EmissionAll> implements EmissionAllService {
}
