<%--
  Created by IntelliJ IDEA.
  User: gzl
  Date: 2020-11-11
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>传统上传</h3>
<form action="file/uploadFile" method="post" enctype="multipart/form-data">
    <input type="file" value="上传文件" name="fupload"/></br>

    <input type="submit" value="提交"/>
</form>

<h3>MVC文件上传</h3>
<form action="file/uploadFile2" method="post" enctype="multipart/form-data">
    <input type="file" value="上传文件" name="upload"/></br>

    <input type="submit" value="提交"/>
</form>
</body>
</html>
