package com.noma.ecarforfuture.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.noma.ecarforfuture.mapper.ECarMapper;
import com.noma.ecarforfuture.model.ECar;
import com.noma.ecarforfuture.service.ECarService;
import org.springframework.stereotype.Service;

@Service
public class ECarServiceImpl extends ServiceImpl<ECarMapper, ECar> implements ECarService {
}
