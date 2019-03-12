<%--
  Created by IntelliJ IDEA.
  User: gaofei
  Date: 2019-2-28
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/jsp/common/import/common.jsp" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1 id="msg">操作成功，3秒后此窗口自动关闭。</h1>
<script>
    $(function () {
        var number = 2;
        setInterval(function () {
            $("#msg").text("操作成功，"+(number--)+"秒后此窗口自动关闭。");
        }, 1000);
        setTimeout(function () {
            window.opener=null;
            window.open('','_self');
            window.close();
        }, 3000);
    })
</script>
</body>
</html>
