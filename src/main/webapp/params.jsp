<%--
  Created by IntelliJ IDEA.
  User: gzl
  Date: 2020-11-09
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<a href="param/testParam?uname=123456">测试参数传递</a>--%>
<%--<form action="param/saveAccount" method="post">
    用户名：<input type="text" name="uname"/></br>
    密码：<input type="text" name="pwd"/></br>
    &lt;%&ndash;年龄：<input type="text" name="user.age"/></br>
    性别：<input type="text" name="user.sex"/></br>&ndash;%&gt;
    年龄：<input type="text" name="list[0].age"/></br>
    性别：<input type="text" name="list[0].sex"/></br>

    年龄：<input type="text" name="map['gz'].age"/></br>
    性别：<input type="text" name="map['gz'].sex"/></br>

    <input type="submit" value="提交"/>
</form>--%>
<form action="param/saveUser" method="post">
    年龄：<input type="text" name="age"/></br>
    性别：<input type="text" name="sex"/></br>
    生日：<input type="text" name="data"/></br>

    <input type="submit" value="提交"/>
</form>

<a href="param/testParam?uname=123456">测试参数传递</a>
</body>
</html>
