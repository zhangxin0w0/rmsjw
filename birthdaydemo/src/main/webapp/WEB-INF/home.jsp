<%--
  Created by IntelliJ IDEA.
  User: 84378
  Date: 2020/2/10
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>首页</title>
    <link rel="stylesheet" href="../static/css/home.css">
</head>
<body>
<div id="container">
    <div id="left">
        <div id="left-top">
            <div class="hz"></div>
            <%--头像--%>
            <div id="lt-img">
                <img src="${user.images}" alt="">
            </div>
            <%--文本--%>
            <div id="lt-tx">
                <span>欢迎：${user.userName}</span>
            </div>
        </div>
        <div id="left-bottom">
            <div class="hz"></div>
            <ul>
                <li><a href="/user/cc.do">生日提醒</a></li>
                <li><a href="/user/getall.do">查看好友</a></li>
                <li><a href="/index/addview.do">新增好友</a></li>
            </ul>
        </div>
    </div>
    <div id="right">
        <%--公告--%>
        <div id="right-text"></div>
        <div id="right-content">
            <c:forEach items="${li}" var="u">
                <div class="rc-hz">
                    <input type="hidden" value="${u.id}">
                    <div>姓名：${u.userName}</div>
                    <div>生日：${u.birthDay}</div>
                    <div><a href="">查看详情</a></div>
                </div>
            </c:forEach>

        </div>
    </div>
</div>


<%--<table>--%>
    <%--<tr>--%>
        <%--<th>序号</th>--%>
        <%--<th>姓名</th>--%>
        <%--<th>生日</th>--%>
        <%--<th>兴趣</th>--%>
        <%--<th>手机号</th>--%>
        <%--<th>QQ</th>--%>
        <%--<th>相识时间</th>--%>
    <%--</tr>--%>
<%--</table>--%>
</body>
</html>
