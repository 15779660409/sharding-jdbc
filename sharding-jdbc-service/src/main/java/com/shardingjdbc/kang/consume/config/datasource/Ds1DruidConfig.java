package com.shardingjdbc.kang.consume.config.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author kanghaijun
 * @create 2019/6/26
 * @describe
 */
@Data
//@Configuration
//@ConfigurationProperties(prefix = "spring.datasource.multi.ds1")
public class Ds1DruidConfig {

    private String filters;

    private String driverClassName;

    private String url;

    private String username;

    private String password;

    @Bean(name = "ds1")
    public DataSource ds2DataSource() throws SQLException {
        DruidDataSource druid = new DruidDataSource();
        // 监控统计拦截的filters
        druid.setFilters(filters);

        // 配置基本属性
        druid.setDriverClassName(driverClassName);
        druid.setUsername(username);
        druid.setPassword(password);
        druid.setUrl(url);
        return druid;
    }

}
