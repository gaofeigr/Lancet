<%--
  Created by IntelliJ IDEA.
  User: gaofei
  Date: 2019-2-28
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/jsp/common/import/common.jsp" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body class="gray-bg">
<div class="wrapper wrapper-content  animated fadeInRight blog">
    <div class="row">
        <c:forEach var="blog" items="${blogs}">
            <div class="col-lg-12">
                <div class="ibox">
                    <div class="ibox-content">
                        <a href="${contextPath}/blog/main/view?id=${blog.id}" class="btn-link" target="_blank">
                            <h2>
                                ${blog.title}
                            </h2>
                        </a>
                        <hr/>
                        <p style="word-break: break-all;">
                            ${blog.summarize}
                        </p>
                        <div class="small m-b-xs" style="text-align: right">
                            <strong>${blog.createPerson.name}</strong>
                            <span class="text-muted">
                                <i class="fa fa-clock-o"></i>
                                <f:formatDate value="${blog.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
                            </span>
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>
<script type="text/javascript" src="${contextPath}/js/tajs.js" charset="UTF-8"></script>
</body>
</html>