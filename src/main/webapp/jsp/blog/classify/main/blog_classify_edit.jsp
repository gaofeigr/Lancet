<%--
  Created by IntelliJ IDEA.
  User: gaofei
  Date: 2019-2-28
  Time: 22:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/jsp/common/import/common.jsp" %>
<html>
<head>
    <title>Lancet - 创建博客分类</title>
</head>
<body>
    <h1>创建博客分类</h1>
    <form action="${contextPath}/blogClassify/main/save">
        分类名称：<input type="text" name="classifyName">
        <br>
        提交：<<input type="submit" value="提交">
    </form>
</body>
</html>
