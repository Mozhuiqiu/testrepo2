<%--
  Created by IntelliJ IDEA.
  User: jie
  Date: 2019/6/15
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>详情页</title>
</head>
<body>

<table border="1">
    <tr>
        <th>序号</th>
        <th>名称</th>
        <th>价格</th>
        <th>图片</th>
        <th>创建时间</th>
        <th>内容</th>
    </tr>
    <tr>
        <td>${item.id}</td>
        <td>${item.name}</td>
        <td>${item.price}</td>
        <td>${item.pic}</td>
        <td>${item.createTime}</td>
        <td>${item.detail}</td>
    </tr>
</table>
</body>
</html>
