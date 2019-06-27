package com.shardingjdbc.kang.consume.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.shardingjdbc.kang.inter.entity.Order;
import com.shardingjdbc.kang.inter.mapper.OrderMapper;
import com.shardingjdbc.kang.inter.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author kanghaijun
 * @create 2019/6/26
 * @describe
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order get(Order order) {
        return orderMapper.selectOne(order);
    }

    @Override
    public List<Order> getAll(Order order) {
        return orderMapper.select(order);
    }

    @Override
    public void update(Order order) {
        orderMapper.updateByPrimaryKeySelective(order);
    }

    @Override
    public void delete(Order order) {
        orderMapper.delete(order);
    }

    @Override
    public void save(Order order) {
        orderMapper.insertSelective(order);
    }
}
