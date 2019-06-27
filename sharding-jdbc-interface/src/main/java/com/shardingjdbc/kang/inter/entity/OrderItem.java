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
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {

    private static final long serialVersionUID = -1929289650806897017L;

    private Integer orderId;

    private Integer price;
}
