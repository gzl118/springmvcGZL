<%--
  Created by IntelliJ IDEA.
  User: gzl
  Date: 2020-11-11
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>查询所有数据</h1>
<c:forEach items="${list}"  var="item">
    ${item.userName}
</c:forEach>
</body>
</html>
