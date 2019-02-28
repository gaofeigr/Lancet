<%--
  Created by IntelliJ IDEA.
  User: gaofei
  Date: 2019-2-28
  Time: 22:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/jsp/common/import/common.jsp" %>
<html>
<head>
    <title>Lancet - 新建用户</title>
</head>
<body>
    <form action="${contextPath}/person/main/save">
        用户名：<input type="text" name="name"><br>
        登录名：<input type="text" name="loginName"><br>
        登陆密码：<input type="password" name="password"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
