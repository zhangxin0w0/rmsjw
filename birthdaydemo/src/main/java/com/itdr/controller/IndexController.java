package com.itdr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: IndexController
 * 日期: 2020/2/11 15:30
 *
 * @author Air张
 * @since JDK 1.8
 */
@Controller
@RequestMapping("/index/")
public class IndexController {

//    跳转到新增好友页面
    @RequestMapping("addview.do")
    public String toAddView(){
        return "add";
    }
}
