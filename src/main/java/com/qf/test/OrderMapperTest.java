package com.qf.test;

import com.qf.mapper.OrderMapper;
import com.qf.pojo.Order;
import com.qf.pojo.OrderUser;
import com.qf.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * wgy 2019/7/6 11:35
 */
public class OrderMapperTest {

    @Test
    public void testFindAll(){
        SqlSession sqlSession= MyBatisUtils.openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orderList = orderMapper.findAll();
        for (Order order : orderList) {
            System.out.println(order.toString());
        }
        sqlSession.close();

    }

    @Test
    public void testFindOrderAndUser(){
        SqlSession sqlSession=MyBatisUtils.openSession();
        OrderMapper orderMapper=sqlSession.getMapper(OrderMapper.class);
        List<OrderUser> orders = orderMapper.findOrderAndUser();
        for (OrderUser order : orders) {
            System.out.println(order.toString());
        }
        sqlSession.close();
    }

    @Test
    public void testFindOrders(){
        SqlSession sqlSession=MyBatisUtils.openSession();
        OrderMapper orderMapper=sqlSession.getMapper(OrderMapper.class);
        List<Order> orders = orderMapper.findOrders();
        for (Order order : orders) {
            System.out.println(order.toString());
        }
        sqlSession.close();
    }

}
