<%--
  Created by IntelliJ IDEA.
  User: gaofei
  Date: 2019-3-12
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/jsp/common/import/common.jsp" %>
<html>
<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight article">
    <div class="row">
        <div class="col-lg-10 col-lg-offset-1">
            <div class="ibox">
                <div class="ibox-content">
                    <div class="small m-b-xs" style="text-align: right">
                        <strong>${blog.createPerson.name}#${blog.classify.classifyName}</strong>
                        <span class="text-muted">
                                <i class="fa fa-clock-o"></i>
                                <f:formatDate value="${blog.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
                        </span>
                    </div>
                    <div class="text-center article-title">
                        <h1>
                            ${blog.title}
                        </h1>
                        <h3>
                            ${blog.summarize}
                        </h3>
                    </div>
                    ${blog.text}
                    <hr>
                </div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript" src="${contextPath}/js/tajs.js" charset="UTF-8"></script>
</body>
</html>
