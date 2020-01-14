package com.itdr.service;

import com.itdr.common.ResponseCode;
import com.itdr.pojo.Users;

/**
 * ClassName: UserService
 * 日期: 2020/1/13 19:17
 *
 * @author Air张
 * @since JDK 1.8
 */
public interface UserService {
    ResponseCode<Users> login(String username,String password);
}
