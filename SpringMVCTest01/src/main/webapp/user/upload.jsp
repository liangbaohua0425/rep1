<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" enctype="multipart/form-data" action="/user/homework" >
        照片名称：<input type="text" name="photoName"><br/>
        <input type="file" name="file" value="上传照片">
        <input type="submit" value="提交">
    </form>
</body>
</html>
