package com.itdr.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * ClassName: IndexDao
 * 日期: 2020/2/7 11:04
 *
 * @author Air张
 * @since JDK 1.8
 */

@Repository
public class IndexDao {
    @Autowired
    private JdbcTemplate jt;


    public int updateByName(String name, int money){
        String sql = "update itdruser set score = score-? where username = ?";
        int update = jt.update(sql, money, name);
        return update;
    }

    public int updateByName2(String name,int money){
        String sql = "update itdruser set score = score+? where username = ?";
        int update = jt.update(sql, money, name);
        return update;
    }
}
