package com.itdr.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: ${NAME}
 * 日期: 2020/1/15 18:45
 *
 * @author Air张
 * @since JDK 1.8
 */
@WebServlet("/backed/index/*")
public class ConfigServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        String[] split = requestURI.split("/");

        switch (split[split.length - 1]){
            case "home":
                home(request,response);
                break;
        }
    }

    private void home(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/home.jsp").forward(request,response);
    }
}
