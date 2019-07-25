package com.qf.test;

import com.qf.mapper.UserMapper;
import com.qf.pojo.Address;
import com.qf.pojo.QueryVo;
import com.qf.pojo.User;
import com.qf.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * wgy 2019/7/6 9:58
 */
public class UserMapperTest {

    @Test
    public void testFindByWhere(){
        SqlSession sqlSession= MyBatisUtils.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.findByWhere("%张%", "1");
        for (User user : users) {
            System.out.println(user.toString());
        }
        sqlSession.close();
    }

    @Test
    public void testSaveUser(){
        SqlSession sqlSession= MyBatisUtils.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user=new User(-1, "马国帅", new Date(),"1" ,new Address("光明顶"));
        userMapper.saveUser(user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testFindByQueryVo(){
        SqlSession sqlSession=MyBatisUtils.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        User user=new User(0, "%张%", null, null, null);
        QueryVo queryVo=new QueryVo();
        queryVo.setUser(user);
        List<User> users = userMapper.findByQueryVo(queryVo);
        System.out.println(users.toString());
        sqlSession.close();
    }
    @Test
    public void testFindByPage(){
        SqlSession sqlSession=MyBatisUtils.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map=new HashMap<>();
        map.put("orderby", "order by id");
        map.put("offset", 5);
        map.put("pageSize", 5);
        List<User> users = userMapper.findByPage(map);
        for (User user : users) {
            System.out.println(user.toString());
        }
        sqlSession.close();

    }

    @Test
    public void testGetCount(){
        SqlSession sqlSession=MyBatisUtils.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        Long count = userMapper.getCount();
        System.out.println("数据个数是:"+count);
        sqlSession.close();
    }

    @Test
    public void testFindByIds(){
        SqlSession sqlSession=MyBatisUtils.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        QueryVo queryVo=new QueryVo();
        queryVo.setIds(Arrays.asList(1,10,16,22,24,25));
        List<User> userList = userMapper.findByIds(queryVo);
        for (User user : userList) {
            System.out.println(user.toString());
        }
        sqlSession.close();
    }

    @Test
    public void testFindByList(){
        SqlSession sqlSession=MyBatisUtils.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.findByList(Arrays.asList(1,10,16,22));
        for (User user : userList) {
            System.out.println(user.toString());
        }
        sqlSession.close();
    }
    @Test
    public void testFindByArray(){
        SqlSession sqlSession=MyBatisUtils.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.findByArray(new Integer[]{1,10,16,22});
        for (User user : userList) {
            System.out.println(user.toString());
        }
        sqlSession.close();
    }


    @Test
    public void testFindUserOrders(){
        SqlSession sqlSession=MyBatisUtils.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        List<User> userOrders = userMapper.findUserOrders();
        for (User userOrder : userOrders) {
            System.out.println(userOrder.toString()+"...."+userOrder.getOrders().toString());
        }
        sqlSession.close();
    }

}
