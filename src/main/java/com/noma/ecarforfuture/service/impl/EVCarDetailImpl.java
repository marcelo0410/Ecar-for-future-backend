package com.noma.ecarforfuture.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.noma.ecarforfuture.mapper.EVCarDetailMapper;
import com.noma.ecarforfuture.model.EVCarDetail;
import com.noma.ecarforfuture.service.EVCarDetailService;
import org.springframework.stereotype.Service;

@Service
public class EVCarDetailImpl extends ServiceImpl<EVCarDetailMapper, EVCarDetail> implements EVCarDetailService {
}
