package com.shardingjdbc.kang.consume.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.shardingjdbc.kang.inter.entity.Config;
import com.shardingjdbc.kang.inter.mapper.ConfigMapper;
import com.shardingjdbc.kang.inter.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author kanghaijun
 * @create 2019/6/26
 * @describe
 */
@Service
public class ConfigServiceImpl implements ConfigService {

    @Autowired
    private ConfigMapper configMapper;

    @Override
    public Config get(Config config) {
        return configMapper.selectOne(config);
    }

    @Override
    public List<Config> getAll(Config config) {
        return configMapper.select(config);
    }

    @Override
    public void update(Config config) {
        configMapper.updateByPrimaryKeySelective(config);
    }

    @Override
    public void delete(Config config) {
        configMapper.delete(config);
    }

    @Override
    public void save(Config config) {
        configMapper.insertSelective(config);
    }
}
