package com.shardingjdbc.kang;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.shardingjdbc.kang.common.util.MyMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.shardingjdbc.kang.inter.mapper", markerInterface = MyMapper.class)
@EnableDubbo
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
