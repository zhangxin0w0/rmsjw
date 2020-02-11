package com.itdr.service;

import com.itdr.pojo.Users;

import java.util.List;

/**
 * ClassName: UserService
 * 日期: 2020/2/10 16:06
 *
 * @author Air张
 * @since JDK 1.8
 */
public interface UserService {
    List<Users> getAll();

    int addOne();

    Users login(String username, String password);

    List<Users> cc();

}
