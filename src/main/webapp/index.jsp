<%--
  Created by IntelliJ IDEA.
  User: gzl
  Date: 2020-11-09
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>springmvc</title>
    <script src="js/jquery.js">
    </script>
    <script>
        $(function () {
            $("#btn").click(function () {
                $.ajax({
                    "url": "gzl/testAjax",
                    contentType: "application/json;charset=UTF-8",
                    data: '{"sex": 1, "age": 15}',
                    dataType: "json",
                    type: "post",
                    success: function (data) {
                        alert(data.age + ":" + data.sex);
                    }
                });
            });
        });
    </script>
</head>
<body>
<h2>第一个单独的springmvc程序</h2>
<a href="gzl/testCookieValue">跳转</a>
<a href="gzl/testForwardAndRedirect">testForwardAndRedirect</a>
<input type="button" id="btn" value="点击"/>

<br/>
<a href="sysuser/findall">查询</a>
</body>
</html>
