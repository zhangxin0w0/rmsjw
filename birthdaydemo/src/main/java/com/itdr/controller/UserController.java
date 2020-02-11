package com.itdr.controller;

import com.itdr.pojo.Users;
import com.itdr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * ClassName: UserController
 * 日期: 2020/2/10 16:02
 *
 * @author Air张
 * @since JDK 1.8
 */

@Controller
@RequestMapping("/user/")
public class UserController {
    @Autowired
    UserService userService;

    //    查看好友
    @RequestMapping("getall.do")
    public ModelAndView getAll() {
        ModelAndView m = new ModelAndView();
        List<Users> li = userService.getAll();
        m.addObject("li", li);
        m.setViewName("list");
        return m;
    }

    //新增好友
    @RequestMapping("add.do")
    public ModelAndView addOne() {
        ModelAndView m = new ModelAndView();
        int i = userService.addOne();
        m.addObject("li", i);
        m.setViewName("home");
        return m;
    }

    //    好友生日提醒
    @RequestMapping("cc.do")
    public ModelAndView cc() {
        ModelAndView m = new ModelAndView();
        List<Users> i = userService.cc();
        m.addObject("li", i);
        m.setViewName("home");
        return m;
    }

    //    用户登录
    @RequestMapping("login.do")
    public ModelAndView login(String username,String password,HttpSession httpsession) {
        Users u = userService.login(username,password);
        httpsession.setAttribute("user",u);
        return cc();
    }

}
