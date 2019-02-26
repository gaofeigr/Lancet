<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>Lancet - 首页</title>
</head>
<style>
    .a {
        text-decoration: none;
    }
    .clearBorder {
        margin: 0;
        padding: 0;
    }
    .centerText {
        line-height: 100%;
        text-align: center;
    }
    .maxWidth {
        width: 100%;
    }
    #top {
        height: 5%;
        background-color: #1b6d85;
    }
    #middle {
        height: 90%;
        background-color: #2aabd2;
    }
    #bottom {
        height: 5%;
        background-color: #1b6d85;
    }
</style>
<html class="clearBorder">
    <body class="maxWidth clearBorder">
        <div id="top" class="maxWidth centerText">
            //todo top
        </div>
        <div id="middle" class="maxWidth centerText">
            //todo middle
            <p><a class="a" href="${pageContext.request.contextPath}/blog/main/index">我的博客</a></p>
        </div>
        <div id="bottom" class="maxWidth centerText">
            //todo bottom
        </div>
    </body>
</html>
