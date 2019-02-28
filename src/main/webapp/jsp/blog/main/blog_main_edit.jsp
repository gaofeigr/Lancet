<%--
  Created by IntelliJ IDEA.
  User: gaofei
  Date: 2019-2-27
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/jsp/common/import/common.jsp" %>
<html>
<head>
    <title>Lancet - 创建博客</title>
</head>
<body>
    <h1>创建博客</h1>
    <form action="${contextPath}/blog/main/save">
        正文：<input type="text" name="text">
        <br>
        提交：<<input type="submit" value="提交">
    </form>
</body>
</html>
