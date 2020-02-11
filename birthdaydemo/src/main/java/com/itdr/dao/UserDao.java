package com.itdr.dao;

import com.itdr.pojo.Users;
import com.itdr.pojo.bo.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName: UserDao
 * 日期: 2020/2/10 16:08
 *
 * @author Air张
 * @since JDK 1.8
 */
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Users> selectAll() {
        String sql = "select * from itdruser where status=?";
        List<Users> li = jdbcTemplate.query(sql, new UserRowMapper(),0);
        return li;
    }

    public Users selectByUserNameAndPassWord(String username, String password) {
        String sql = "select * from itdruser where  username=? and password=?";
        Users u = jdbcTemplate.queryForObject(sql, new UserRowMapper(), username, password);
        return u;
    }
}
