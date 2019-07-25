package com.qf.convert;

import com.qf.pojo.Address;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * wgy 2019/7/6 11:50
 */
public class AddressConvert implements TypeHandler<Address> {

    /**
     * 添加更新使用
     * ps 预编译的命令对象
     * i  列的索引
     * parameter  java对象中的类型
     * @param ps
     * @param i
     * @param parameter
     * @param jdbcType
     * @throws SQLException
     */
    @Override
    public void setParameter(PreparedStatement ps, int i, Address parameter, JdbcType jdbcType) throws SQLException {
        if(parameter==null){
            ps.setString(i, null);
        }else{
            ps.setString(i, parameter.getAdd());
        }
    }

    /**
     * 查询使用使用的方法
     * @param rs
     * @param columnName
     * @return
     * @throws SQLException
     */
    @Override
    public Address getResult(ResultSet rs, String columnName) throws SQLException {
        String value=rs.getString(columnName);
        Address address=new Address();
        address.setAdd(value);
        return address;
    }

    @Override
    public Address getResult(ResultSet rs, int columnIndex) throws SQLException {
        return null;
    }

    @Override
    public Address getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return null;
    }
}
