package com.shardingjdbc.kang.inter.entity;

import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author kanghaijun
 * @create 2019/6/26
 * @describe
 */
@Data
@Table(name = "tb_user")
public class User implements Serializable {

    private static final long serialVersionUID = -3164538139485362590L;

    private Integer id;

    private String name;

    private Integer age;

    private Integer sex;
}
