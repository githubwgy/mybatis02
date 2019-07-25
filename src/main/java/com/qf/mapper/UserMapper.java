package com.qf.mapper;

import com.qf.pojo.QueryVo;
import com.qf.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * wgy 2019/7/6 9:45
 */
public interface UserMapper {
    //根据id查询
    public User findById(Integer id);
    //根据姓名查询
    public List<User> findByName(String username);
    //查询所有
    public List<User> findAll();
    //根据姓名和性别查询  姓名包含"%张%"  性别为 1  不要写parameterType
    public List<User> findByWhere(@Param("username") String username, @Param("sex") String sex);


    public void saveUser(User user);

    //需求1 ：根据用户名查询   包装pojo
    public List<User> findByQueryVo(QueryVo vo);

    //需求2：分页查询用户信息  map集合
    public List<User> findByPage(Map<String,Object> map);

    //需求3：查询用户表数据条数
    public Long getCount();

    //需求4：根据多个id查询用户信息

    public List<User> findByIds(QueryVo vo);

    public List<User> findByList(List<Integer> xxx);

    public List<User> findByArray(Integer[] ids);


    //需求5 ，根据用户关联订单 一对多查询
    public List<User> findUserOrders();



}
