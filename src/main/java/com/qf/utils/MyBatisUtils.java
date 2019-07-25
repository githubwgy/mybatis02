package com.qf.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * wgy 2019/7/6 9:58
 */
public class MyBatisUtils {

    private static SqlSessionFactory factory;
    static {
        try {
            InputStream is= Resources.getResourceAsStream("mybatis-config.xml");
            factory=new SqlSessionFactoryBuilder().build(is);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("mybatis工厂初始化失败");
        }
    }

    public static SqlSession openSession(){
        return factory.openSession();
    }
//    public static SqlSessionFactory getFactory(){
//        return factory;
//    }
}
