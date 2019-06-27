package com.shardingjdbc.kang.consume.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.shardingjdbc.kang.inter.entity.User;
import com.shardingjdbc.kang.inter.mapper.UserMapper;
import com.shardingjdbc.kang.inter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author kanghaijun
 * @create 2019/6/26
 * @describe
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User get(User user) {
        return userMapper.selectOne(user);
    }

    @Override
    public List<User> getAll(User user) {
        return userMapper.select(user);
    }

    @Override
    public void update(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void delete(User user) {
        userMapper.delete(user);
    }

    @Override
    public void save(User user) {
        userMapper.insertSelective(user);
    }
}
