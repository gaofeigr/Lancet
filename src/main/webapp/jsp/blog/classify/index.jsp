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
    <title>Lancet - 博客分类首页</title>
    <link href="${contextPath}/css/bootstrap/plugins/bootstrap-table/bootstrap-table.min.css" rel="stylesheet">
    <link href="${contextPath}/css/bootstrap/plugins/iCheck/custom.css" rel="stylesheet">
    <link href="${contextPath}/css/bootstrap/plugins/chosen/chosen.css" rel="stylesheet">
    <link href="${contextPath}/css/bootstrap/plugins/colorpicker/css/bootstrap-colorpicker.min.css" rel="stylesheet">
    <link href="${contextPath}/css/bootstrap/plugins/cropper/cropper.min.css" rel="stylesheet">
    <link href="${contextPath}/css/bootstrap/plugins/switchery/switchery.css" rel="stylesheet">
    <link href="${contextPath}/css/bootstrap/plugins/jasny/jasny-bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/css/bootstrap/plugins/nouslider/jquery.nouislider.css" rel="stylesheet">
    <link href="${contextPath}/css/bootstrap/plugins/datapicker/datepicker3.css" rel="stylesheet">
    <link href="${contextPath}/css/bootstrap/plugins/ionRangeSlider/ion.rangeSlider.css" rel="stylesheet">
    <link href="${contextPath}/css/bootstrap/plugins/ionRangeSlider/ion.rangeSlider.skinFlat.css" rel="stylesheet">
    <link href="${contextPath}/css/bootstrap/plugins/awesome-bootstrap-checkbox/awesome-bootstrap-checkbox.css" rel="stylesheet">
    <link href="${contextPath}/css/bootstrap/plugins/clockpicker/clockpicker.css" rel="stylesheet">
    <link href="${contextPath}/js/bootstrap/address/main.css" rel="stylesheet"/>
    <script type="text/javascript" src="${contextPath}/js/map.js"></script>
    <style>
        #searchDiv {
            padding: 0px;
        }
        #searchDiv input {
            width: auto;
            display: inline;
            height: 31px;
        }
    </style>
</head>
<body>
<div class="ibox float-e-margins">
    <div class="ibox-title">
        <h2>博客>博客分类</h2>
    </div>
    <div class="ibox-content">
        <div class="row row-lg">
            <div class="col-sm-6" style="width: 100%">
                <div id="searchDiv" class="col-sm-6" style="width: 100%">
                    <h4 class="example-title" style="display: inline">博客分类列表</h4>
                    <div style="float: right">
                        <input id="classifyName" type="text" placeholder="分类名称" class="form-control" style="width: 200px;"/>
                        <input id="createPerson" type="text" placeholder="创建者" class="form-control" style="width: 200px;"/>
                        <input id="parentId" type="hidden" placeholder="上级分类" class="form-control" style="width: 200px;"/>
                        <input id="search" type="button" class="btn btn-sm btn-outline btn-primary" value="查询"/>
                    </div>
                </div>
                <div class="example">
                    <table id="exampleTableFromData" data-mobile-responsive="true">
                    </table>
                    <div style="float: right">
                        <input id="liquidation" type="button"
                               class="btn btn-xm btn-outline btn-primary"
                               data-toggle="modal" href="index.jsp#create" value="新建"/>
                        <input id="back" type="button" style="display: none;"
                               class="btn btn-xm btn-outline btn-primary"
                               data-toggle="modal" href="index.jsp#create" value="返回"/>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<div id="pacageInfo" class="modal fade" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-body">
                <div class="ibox float-e-margins" style="display: flow-root;">
                    <form class="form-horizontal" action="${contextPath}/blogClassify/main/save" method="post">
                        <div class="ibox-content">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">分类名称：</label>
                                    <div class="col-sm-8">
                                        <input type="text" showName="classifyName" class="form-control" readonly>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">上级分类：</label>
                                    <div class="col-sm-8">
                                        <input type="text" showName="parentClassify.id" class="form-control" readonly/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">创建者：</label>
                                    <div class="col-sm-8">
                                        <input type="text" showName="createPerson.name" class="form-control" readonly>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">创建时间：</label>
                                    <div class="col-sm-8">
                                        <input showName="createTime" class="form-control" value="${createTime}" readonly>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<div id="create" class="modal fade" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-body">
                <div class="ibox float-e-margins" style="display: flow-root;">
                    <%@ include file="/jsp/blog/classify/main/blog_classify_edit.jsp" %>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="${contextPath}/js/bootstrap/content.min.js?v=1.0.0"></script>
<script src="${contextPath}/js/bootstrap/plugins/bootstrap-table/bootstrap-table.min.js"></script>
<script src="${contextPath}/js/bootstrap/plugins/bootstrap-table/bootstrap-table-mobile.min.js"></script>
<script src="${contextPath}/js/bootstrap/plugins/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>
<script src="${contextPath}/js/bootstrap/stats.js"></script>
<script src="${contextPath}/js/bootstrap/plugins/datapicker/bootstrap-datepicker.js"></script>
<script src="${contextPath}/js/bootstrap/plugins/jasny/jasny-bootstrap.min.js"></script>
<script src="${contextPath}/js/bootstrap/plugins/chosen/chosen.jquery.js"></script>
<script src="${contextPath}/js/bootstrap/plugins/jsKnob/jquery.knob.js"></script>
<script src="${contextPath}/js/bootstrap/plugins/prettyfile/bootstrap-prettyfile.js"></script>
<script src="${contextPath}/js/bootstrap/plugins/nouslider/jquery.nouislider.min.js"></script>
<script src="${contextPath}/js/bootstrap/plugins/switchery/switchery.js"></script>
<script src="${contextPath}/js/bootstrap/plugins/ionRangeSlider/ion.rangeSlider.min.js"></script>
<script src="${contextPath}/js/bootstrap/plugins/iCheck/icheck.min.js"></script>
<script src="${contextPath}/js/bootstrap/plugins/metisMenu/jquery.metisMenu.js"></script>
<script src="${contextPath}/js/bootstrap/plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
<script src="${contextPath}/js/bootstrap/plugins/clockpicker/clockpicker.js"></script>
<script src="${contextPath}/js/bootstrap/plugins/cropper/cropper.min.js"></script>
<script>
    function initTable() {
        //先销毁表格
        $('#exampleTableFromData').bootstrapTable('destroy');
        //初始化表格,动态从服务器加载数据
        $("#exampleTableFromData").bootstrapTable({
            method: "post",  //使用get请求到服务器获取数据
            url: "${contextPath}/blogClassify/main/list", //获取数据的Servlet地址
            striped: true,  //表格显示条纹
            pagination: true, //启动分页
            pageSize: 15,  //每页显示的记录数
            pageNumber: 1, //当前第几页
            contentType: "application/x-www-form-urlencoded",
            pageList: [10, 25, 50, 100],  //记录数可选列表
            singleSelect: true,     //单选checkbox
            search: false,  //是否启用查询
            sidePagination: "server", //表示服务端请求
            //设置为undefined可以获取pageNumber，pageSize，searchText，sortName，sortOrder
            //设置为limit可以获取limit, offset, search, sort, order
            queryParamsType: "undefined",
            queryParams: function queryParams(params) {   //设置查询参数
                var param = {
                    //插件自动的参数
                    pageNumber: params.pageNumber,          //当前页数
                    pageSize: params.pageSize,              //每页显示数据行数
                    //自定义的额外的参数
                    classifyName: $("#classifyName").val(),//名称
                    createPerson: $("#createPerson").val(),//创建者
                    parentId: $("#parentId").val(),//上级分类
                };
                return param;
            },
            columns: [     //设置显示的列
                {
                    title: '序号',
                    field: 'id',
                    formatter: function (value, row, index) {
                        return index+1;
                    },
                    align: 'center'
                },
                {
                    title: '分类名称',
                    field: 'classifyName',
                    align: 'center'
                },
                {
                    title: '创建者',
                    field: 'createPerson.name',
                    align: 'center'
                },
                {
                    title: '创建时间',
                    field: 'createTime',
                    align: 'center',
                    formatter: function (value, row, index) {
                        return formatDate(row.createTime);
                    }
                },
                {
                    title: '上级分类',
                    field: 'parentClassify',
                    align: 'center',
                    formatter: function (value, row, index) {
                        if (typeof(row.parentClassify) == "undefined") {
                            return "无";
                        } else {
                            return row.parentClassify.classifyName;
                        }
                    }
                },
                {
                    title: '操作',
                    field: 'input',
                    align: 'center',
                    width: '150px',
                    formatter: function (value, row, index) {
                        return '<input type="button" class="btn btn-sm btn-outline btn-primary showInfo" data-toggle="modal"' +
                            'href="table_data_tables.jsp#pacageInfo" value="查看"/>'
                            + '<input type="button" style="margin-left: 10px;" class="btn btn-sm btn-outline btn-primary delete" value="删除"/>';
                    }
                }
            ],
            onClickRow: function (row) {
                $("#parentId").val(row.id);
                $("#search").click();
                $("#back").show();
                //设置bootstrapTable起始的高度
                $('#exampleTableFromData').bootstrapTable({height:$(window).height()-120});
                //当表格内容的高度小于外面容器的高度，容器的高度设置为内容的高度，相反时容器设置为窗口的高度-160
                if($(".fixed-table-body table").height()<$(".fixed-table-container").height()){
                    $(".fixed-table-container").css({"padding-bottom":"0px",height:$(".fixed-table-body table").height()+31});
                    // 是当内容少时，使用搜索功能高度保持不变
                    $('#exampleTableFromData').bootstrapTable('resetView',{height:"auto"});
                }else{
                    $(".fixed-table-container").css({height:$(window).height()-160});
                }
            }
        });
    }

    $(function () {
        //初始化日期控件
        $("#data_5 .input-daterange").datepicker({keyboardNavigation: !1, forceParse: !1, autoclose: !0});
        //调用函数，初始化表格
        initTable();
        //当点击查询按钮的时候执行
        $("#search").bind("click", initTable);
        //查看
        $("#exampleTableFromData").on("click", ".showInfo", function () {
            var classifyName = $(this).parent().parent().find("td:eq(1)").text();
            var createPersonName = $(this).parent().parent().find("td:eq(2)").text();
            var createTime = $(this).parent().parent().find("td:eq(3)").text();
            var parentClassifyId = $(this).parent().parent().find("td:eq(4)").text();
            $("input[showName='classifyName']").val(classifyName);
            $("input[showName='createPerson.name']").val(createPersonName);
            $("input[showName='createTime']").val(createTime);
            $("input[showName='parentClassify.id']").val(parentClassifyId);
        })
        //删除
        $("#exampleTableFromData").on("click", ".delete", function () {
            var serialNumber = $(this).parent().parent().find("td:eq(1)").text();
            $.post("${pageContext.request.contextPath }/tabOrderform/deleteOrderBySerialNumber", {serialNumber: serialNumber}, function (data) {
                if (data) {
                    alert("删除成功！");
                    initTable();
                } else {
                    alert("删除失败。");
                }
            })
        })
        //设置bootstrapTable起始的高度
        $('#exampleTableFromData').bootstrapTable({height:$(window).height()-120});
        //当表格内容的高度小于外面容器的高度，容器的高度设置为内容的高度，相反时容器设置为窗口的高度-160
        if($(".fixed-table-body table").height()<$(".fixed-table-container").height()){
            $(".fixed-table-container").css({"padding-bottom":"0px",height:$(".fixed-table-body table").height()+31});
            // 是当内容少时，使用搜索功能高度保持不变
            $('#exampleTableFromData').bootstrapTable('resetView',{height:"auto"});
        }else{
            $(".fixed-table-container").css({height:$(window).height()-160});
        }
    })

    /**
     * 格式化日期
     * @param now
     * @returns {string}
     */
    function formatDate(now) {
        var date = new Date(parseInt(now));
        var year = date.getFullYear(),
            month = (date.getMonth() + 1) < 10 ? "0" + (date.getMonth() + 1) : (date.getMonth() + 1),
            day = date.getDate() < 10 ? "0" + date.getDate() : date.getDate(),
            hour = date.getHours() < 10 ? "0" + date.getHours() : date.getHours(),
            minute = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes(),
            second = date.getSeconds() < 10 ? "0" + date.getSeconds() : date.getSeconds();
        return year + "-" + month + "-" + day + '&nbsp;' + hour + ":" + minute + ":" + second;
    }
</script>
</body>
</html>