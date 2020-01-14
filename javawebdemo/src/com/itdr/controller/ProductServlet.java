package com.itdr.controller;

import com.itdr.common.ResponseCode;
import com.itdr.service.ProductService;
import com.itdr.service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: ${NAME}
 * 日期: 2020/1/13 19:13
 *
 * @author Air张
 * @since JDK 1.8
 */
@WebServlet("/product/*")
public class ProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    private ProductService productService = new ProductServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        String[] split = requestURI.split("/");

        switch (split[split.length - 1]){
            case "getall":
                getAllProduct(request,response);
                break;

        }
    }


    //获取所有商品数据
    private void getAllProduct(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        ResponseCode allProduct = productService.getAllProduct();
        request.setAttribute("plist",allProduct);
        request.getRequestDispatcher("/WEB-INF/plist.jsp").forward(request,response);
    }

}
