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
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="${contextPath}/css/bootstrap/plugins/simditor/simditor.css" rel="stylesheet" type="text/css"/>
    <base target="_blank">
</head>

<body class="gray-bg">
<div class="wrapper wrapper-content">
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>新建博客</h5>
                </div>
                <div class="ibox-content">
                    <textarea id="editor" placeholder="开始编写博客" autofocus>

                    </textarea>
                </div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript" src="${contextPath}/js/bootstrap/content.min.js"></script>
<script type="text/javascript" src="${contextPath}/js/bootstrap/plugins/simditor/module.js"></script>
<script type="text/javascript" src="${contextPath}/js/bootstrap/plugins/simditor/uploader.js"></script>
<script type="text/javascript" src="${contextPath}/js/bootstrap/plugins/simditor/hotkeys.js"></script>
<script type="text/javascript" src="${contextPath}/js/bootstrap/plugins/simditor/simditor.js"></script>
<script>
    $(document).ready(function () {
        var editor = new Simditor({textarea: $("#editor"), defaultImage: "img/a9.jpg"})
    });
    $(function () {
        $(".simditor-toolbar ul li a span").css("line-height", "40px");
    })
</script>
<script type="text/javascript" src="${contextPath}/js/tajs.js" charset="UTF-8"></script>
</body>
</html>