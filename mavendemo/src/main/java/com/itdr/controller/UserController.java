package com.itdr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: UserController
 * 日期: 2020/2/10 10:35
 *
 * @author Air张
 * @since JDK 1.8
 */

@Controller
public class UserController {

    @RequestMapping("/user/show.do")
    public ModelAndView show(){
        System.out.println("请求进来了！");
        ModelAndView m =new ModelAndView();
        m.setViewName("home");
        m.addObject("name","zx");
        return m;
    }

    @RequestMapping("/user/hh.do")
    public String hh(){
      return "lisy";
    }
}
