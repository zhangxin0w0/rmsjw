<%--
  Created by IntelliJ IDEA.
  User: 84378
  Date: 2020/1/15
  Time: 18:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>系统出错啦！</title>
    <style>
        #left{
            width: 30%;
            height: 100%;
            float: left;
            background-color: seagreen;
        }
        #right{
            width: 70%;
            float: right;
            background-color: salmon;
        }
    </style>
</head>
<body>
<div id="left">
    <p>
        <a href="/backed/index/home">回到首页</a>
    </p>
    <h1>欢迎${us.username}登录管理后台</h1>
    <a href="/product/getall">获取所有商品数据</a>
</div>
<div id="right">
    <h1>系统出错啦！请联系系统管理员！</h1>
</div>
</body>
</html>
