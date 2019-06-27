package com.shardingjdbc.kang.consume.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.shardingjdbc.kang.inter.entity.OrderItem;
import com.shardingjdbc.kang.inter.mapper.OrderItemMapper;
import com.shardingjdbc.kang.inter.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author kanghaijun
 * @create 2019/6/26
 * @describe
 */
@Service
public class OrderItemServiceImpl implements OrderItemService {

    @Autowired
    private OrderItemMapper orderItemMapper;


    @Override
    public OrderItem get(OrderItem orderItem) {
        return orderItemMapper.selectOne(orderItem);
    }

    @Override
    public List<OrderItem> getAll(OrderItem orderItem) {
        return orderItemMapper.select(orderItem);
    }

    @Override
    public void update(OrderItem orderItem) {
        orderItemMapper.updateByPrimaryKeySelective(orderItem);
    }

    @Override
    public void delete(OrderItem orderItem) {
        orderItemMapper.delete(orderItem);
    }

    @Override
    public void save(OrderItem orderItem) {
        orderItemMapper.insertSelective(orderItem);
    }
}
