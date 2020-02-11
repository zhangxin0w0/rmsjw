package com.itdr.pojo.bo;

import com.itdr.pojo.Users;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ClassName: UserRowMapper
 * 日期: 2020/2/10 16:11
 *
 * @author Air张
 * @since JDK 1.8
 */
public class UserRowMapper implements RowMapper<Users> {
    @Override
    public Users mapRow(ResultSet resultSet, int i) throws SQLException {
        Users u = new Users();
        u.setId(resultSet.getInt("id"));
        u.setUserName(resultSet.getString("username"));
        u.setPassWord(resultSet.getString("password"));
        u.setImages(resultSet.getString("images"));
        u.setBirthDay(resultSet.getDate("birthday"));
        u.setInterest(resultSet.getString("interest"));
        u.setPhoneNumber(resultSet.getInt("phonenumber"));
        u.setQq(resultSet.getInt("qq"));
        u.setStatus(resultSet.getInt("status"));
        u.setCreateTime(resultSet.getTime("create_time"));
        u.setUpdateTime(resultSet.getTime("update_time"));

        return u;
    }
}
