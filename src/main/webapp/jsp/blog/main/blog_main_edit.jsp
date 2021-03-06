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
    <link href="${contextPath}/css/bootstrap/plugins/iCheck/custom.css" rel="stylesheet">
    <base target="_blank">
</head>

<body class="gray-bg">
<div class="wrapper wrapper-content">
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <form class="form-horizontal" action="${contextPath}/blog/main/saveEdit" method="post">
                    <div class="ibox-title">
                        <h5>编辑博客</h5>
                    </div>
                    <div class="ibox-content">
                        <div class="form-group">
                            <div class="col-sm-1 col-sm-offset-11">
                                <button class="btn btn-primary" type="submit">保存</button>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-1 control-label">标题：</label>
                            <div class="col-sm-11">
                                <input type="text" name="title" class="form-control" value="${blog.title}" autocomplete="off">
                                <input type="hidden" name="id" class="form-control" value="${blog.id}" autocomplete="off">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-1 control-label">概述：</label>
                            <div class="col-sm-11">
                                <input type="text" name="summarize" class="form-control" value="${blog.summarize}" autocomplete="off">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-1 control-label">正文：</label>
                            <div class="col-sm-11">
                                <textarea id="text" name="text" autofocus>
                                    ${blog.text}
                                </textarea>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-1 control-label">分类：</label>
                            <div class="col-sm-11">
                                <c:forEach var="classify" items="${allClassify}">
                                    <div class="radio-inline i-checks">
                                        <label><input type="radio" value="${classify.id}" ${classify.id == blog.classify.id ? "checked" : ""} name="classify.id"> <i></i> ${classify.classifyName}</label>
                                    </div>
                                </c:forEach>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-1 control-label">创建者：</label>
                            <div class="col-sm-11">
                                <input type="text" name="createPerson.name" value="${blog.createPerson.name}" class="form-control" readonly>
                                <input type="hidden" name="createPerson.id" value="${blog.createPerson.id}" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-1 control-label">创建时间：</label>
                            <div class="col-sm-11">
                                <input name="createTime" class="form-control" value="${createTime}" readonly>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-1 control-label">最后修改时间：</label>
                            <div class="col-sm-11">
                                <input name="createTime" class="form-control" value="${lastModifyTime}" readonly>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript" src="${contextPath}/js/bootstrap/content.min.js"></script>
<script type="text/javascript" src="${contextPath}/js/bootstrap/plugins/simditor/module.js"></script>
<script type="text/javascript" src="${contextPath}/js/bootstrap/plugins/simditor/uploader.js"></script>
<script type="text/javascript" src="${contextPath}/js/bootstrap/plugins/simditor/hotkeys.js"></script>
<script type="text/javascript" src="${contextPath}/js/bootstrap/plugins/simditor/simditor.js"></script>
<script type="text/javascript" src="${contextPath}/js/bootstrap/plugins/iCheck/icheck.min.js"></script>
<script type="text/javascript" src="${contextPath}/js/tajs.js" charset="UTF-8"></script>
<script>
    $(document).ready(function(){$(".i-checks").iCheck({checkboxClass:"icheckbox_square-green",radioClass:"iradio_square-green",})});
    $(document).ready(function () {
        var editor = new Simditor({textarea: $("#text"), defaultImage: "img/a9.jpg"})
    });
    $(function () {
        $(".simditor-toolbar ul li a span").css("line-height", "40px");
    })
</script>
<script type="text/javascript" src="${contextPath}/js/tajs.js" charset="UTF-8"></script>
</body>
</html>