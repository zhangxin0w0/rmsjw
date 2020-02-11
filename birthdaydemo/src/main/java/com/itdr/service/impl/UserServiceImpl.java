package com.itdr.service.impl;

import com.itdr.dao.UserDao;
import com.itdr.pojo.Users;
import com.itdr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * ClassName: UserServiceImpl
 * 日期: 2020/2/10 16:06
 *
 * @author Air张
 * @since JDK 1.8
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<Users> getAll() {
        List<Users> li = userDao.selectAll();
        return li;
    }

    @Override
    public int addOne() {
        return 0;
    }

    @Override
    public Users login(String username, String password) {
        //参数非空判断
        if(StringUtils.isEmpty(username)){
//            错误
            return null;
        }
        if(StringUtils.isEmpty(password)){
//            错误
            return null;
        }

        //查找用户是否存在
        Users u = userDao.selectByUserNameAndPassWord(username,password);
        if(u == null){
//            错误
            return null;
        }
        return u;
    }


    @Override
    public List<Users> cc() {
        //创建空集合保存数据
        List<Users> liNew = new ArrayList<Users>();
        //查询所有好友
        List<Users> li = userDao.selectAll();
        //获取当前系统时间的日期
        Calendar c = Calendar.getInstance();
        int i = c.get(Calendar.DAY_OF_MONTH);
        //遍历每个好友，看那个好友的生日是3天以内的
        for (Users users : li) {
            Date birthDay = users.getBirthDay();
            Calendar c2 = Calendar.getInstance();
            c2.setTime(birthDay);
            int i2 = c2.get(Calendar.DAY_OF_MONTH);

            //符合条件的好友放进新集合
            if((i2-i)<=3 && (i2-i)>=0 ){
                liNew.add(users);
            }
        }

        return liNew;
    }
}
