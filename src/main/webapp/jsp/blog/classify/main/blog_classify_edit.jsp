<%--
  Created by IntelliJ IDEA.
  User: gaofei
  Date: 2019-2-28
  Time: 22:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/jsp/common/import/common.jsp" %>
<form class="form-horizontal" action="${contextPath}/blogClassify/main/save" method="post">
    <div class="ibox-title" style="border-top: 0px;">
        <a class="close" data-dismiss="modal">×</a>
        <h5>创建博客分类</h5>
    </div>
    <div class="ibox-content">
        <div class="col-md-12">
            <div class="form-group">
                <label class="col-sm-3 control-label">分类名称：</label>
                <div class="col-sm-8">
                    <input type="text" name="classifyName" class="form-control" placeholder="请输入分类名称" autocomplete="off">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-3 control-label">上级分类：</label>
                <div class="col-sm-8">
                    <%--<select class="form-control" name="parentClassify.classifyName">--%>
                    <%--<option>选项 1</option>--%>
                    <%--<option selected>选项 2</option>--%>
                    <%--</select>--%>
                    <%--<input type="hidden" name="parentClassify.id" value="parentClassify.id"/>--%>
                </div>
            </div>
            <%--<div class="form-group">--%>
                <%--<label class="col-sm-3 control-label">创建者：</label>--%>
                <%--<div class="col-sm-8">--%>
                    <%--<input type="text" name="createPerson.name" value="${createPerson.name}" class="form-control" readonly>--%>
                    <%--<input type="hidden" name="createPerson.id" value="${createPerson.id}" class="form-control">--%>
                <%--</div>--%>
            <%--</div>--%>
            <%--<div class="form-group">--%>
                <%--<label class="col-sm-3 control-label">创建时间：</label>--%>
                <%--<div class="col-sm-8">--%>
                    <%--<input name="createTime" class="form-control" value="${createTime}" readonly>--%>
                <%--</div>--%>
            <%--</div>--%>
            <div class="form-group">
                <div class="col-sm-4 col-sm-offset-8">
                    <button class="btn btn-primary" type="submit">保存</button>
                    <button class="btn btn-white" type="button" onclick="closeThisWin()">取消</button>
                </div>
            </div>
        </div>
    </div>
</form>
