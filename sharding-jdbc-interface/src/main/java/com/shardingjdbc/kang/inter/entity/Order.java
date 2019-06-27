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
@Table(name = "tb_order")
public class Order implements Serializable {

    private static final long serialVersionUID = 7532732794260962419L;

    private Integer id;

    private Integer totalPrice;

    private Integer userId;
}
