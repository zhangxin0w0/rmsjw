<%--
  Created by IntelliJ IDEA.
  User: 84378
  Date: 2020/1/14
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="errorpage.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>商品列表</title>
    <style>
        #left {
            width: 30%;
            height: 100%;
            float: left;
            background-color: seagreen;
        }

        #right {
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
    <h1>欢迎${user.data.username}登录管理后台</h1>
    <a href="/backed/product/getall">获取所有商品数据</a>
</div>
<div id="right">
    <c:if test="${not empty plist.data}">
        <table>
            <tr>
                <th>序号</th>
                <th>商品名称</th>
                <th>商品价格</th>
                <th>商品库存</th>
                <th>商品在售</th>
                <th>商品创建时间</th>
                <th>商品更新时间</th>
            </tr>

            <c:forEach items="${plist.data}" var="p" >
                <tr>
                    <td>${p.id}</td>
                    <td>${p.pname}</td>
                    <td>${p.price}</td>
                    <td>${p.pnum}</td>
                    <td class="pt">${p.type}</td>
                    <td>${p.create_time}</td>
                    <td>${p.update_time}</td>
                    <td>
                        <button onclick="toType(this)">下架</button>
                        <button>修改</button>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:if>

    <c:if test="${empty plist.data}">
        没有更多的商品
    </c:if>
</div>
</body>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<script>
    function toType(but) {
        var id2 = $(but).parent().parent().children().first().text();
        $.get(
            "/backed/product/totype",
            {id:id2},
            function (data) {
                var num = Number(data);
                if(data>0){
                    $(but).parent().parent().children().first().nextAll(".pt").text(1);
                }
            }
        )
    }
</script>
</html>
