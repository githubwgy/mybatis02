package com.qf.mapper;

import com.qf.pojo.Order;
import com.qf.pojo.OrderUser;

import java.util.List;

/**
 * wgy 2019/7/6 9:45
 */
public interface OrderMapper {
    public List<Order> findAll();

    //需求5 ：查询订单信息和用户信息

    public List<OrderUser> findOrderAndUser();

    //需求5 ：查询订单信息和用户信息
    public List<Order> findOrders();
}
