<%--
  Created by IntelliJ IDEA.
  User: gaofei
  Date: 2019-2-28
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="shortcut icon" href="${contextPath}/img/ico.ico" type="image/x-icon" />
<%@ include file="/jsp/common/import/css.jsp" %>
<%@ include file="/jsp/common/import/js.jsp" %>
<%
    request.setAttribute("contextPath", request.getContextPath());
%>