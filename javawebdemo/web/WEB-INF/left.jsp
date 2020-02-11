<%--
  Created by IntelliJ IDEA.
  User: 84378
  Date: 2020/1/18
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        #left {
            width: 20%;
            height: 100%;
            float: left;
            background-color: seagreen;
        }
        #le-2{
            width: 100%;
            height: 100px;
            background-color: white;
        }
        #le-3{
            width: 100%;
            height: 600px;
            background-color: salmon;
        }
    </style>
</head>
<body>
<div id="left">
    <div id="le-2">
        <span>
            <a href="/backed/index/home">回到首页</a>
        </span>
        <h1>欢迎${user.data.username}登录管理后台</h1>
    </div>
    <div id="le-3">
        <ul>
            <li>
                <a href="/backed/product/getall">商品列表</a>
            </li>
            <li>
                <a href="/backed/index/addproduct">新增商品</a>
            </li>
        </ul>

    </div>


</div>
</body>
</html>
