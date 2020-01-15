<%--
  Created by IntelliJ IDEA.
  User: 84378
  Date: 2020/1/14
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员登录</title>
</head>
<body>
<form action="/backed/user/login" method="post">
    <input type="text" placeholder="账户" name="username">
    <input type="password" placeholder="密码" name="password">
    <input type="submit" value="登录">
</form>
</body>
</html>
