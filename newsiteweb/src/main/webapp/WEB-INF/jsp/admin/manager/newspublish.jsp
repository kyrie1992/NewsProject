<%--
  Created by IntelliJ IDEA.
  User: zhengnawei
  Date: 2017/11/26
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="../common.jsp"></c:import>
<script type="text/javascript">
    ctx= "${ctx}";
    $(function () {
        addFoucsLi($("#newsPublishLi"));
    });
</script>
<html>
<head>
    <title>新闻发布</title>
</head>
<body class="skin-black">
<!-- header logo: style can be found in header.less -->
<c:import url="../header.jsp"></c:import>

<div class="wrapper row-offcanvas row-offcanvas-left">
    <!-- Left side column. contains the logo and sidebar -->
    <c:import url="../leftmenu.jsp"></c:import>
    <aside class="right-side">
        <!-- Main content -->
        <section class="content">
            <div class="page-header">
                <h1>发布新闻<small>共100条</small></h1>
            </div>
            <div class="newcontainer" id="news_insert" style="font-size:20px">
                <form name="mainForm" action="<%= request.getContextPath()%>/notice/showNotice" method="post">
                    <div>
                        <span>新闻标题:</span><input type="text" id="title" name="title">
                    </div>
                    <div>
                        <span>新闻作者:</span><input type="text" id="author" name="author">
                    </div>
                    <div>
                        <span>摄影者  :   </span><input type="text" id="photographer" name="photographer">
                    </div>
                    <div>
                        <span>审批人  :   </span><input type="text" id="approver" name="approver">
                    </div>
                    <div>
                        <span>新闻种类:</span>
                        <select id="kind" name="kind">
                            <option value="0">军事</option>
                            <option value="1" selected="selected">政治</option>
                            <option value="2">后勤</option>
                            <option value="2">中心</option>
                        </select>
                    </div>
                    <div>
                        <p >所属单位：<br/>
                            <input type="radio" name="unit" value="司令部"  style="margin-left:20px"/>司令部
                            <input type="radio" name="unit" value="政治处"  style="margin-left:20px"/>政治处
                            <input type="radio" name="unit" value="后勤处"  style="margin-left:20px"/>后勤处<br/>
                            <input type="radio" name="unit" value="一大队"  style="margin-left:20px"/>一大队
                            <input type="radio" name="unit" value="一中队"  style="margin-left:20px"/>一中队
                            <input type="radio" name="unit" value="二中队"  style="margin-left:20px"/>二中队
                            <input type="radio" name="unit" value="三中队"  style="margin-left:20px"/>三中队<br/>
                            <input type="radio" name="unit" value="二大队"  style="margin-left:20px"/>二大队
                            <input type="radio" name="unit" value="四中队"  style="margin-left:20px"/>四中队
                            <input type="radio" name="unit" value="五中队"  style="margin-left:20px"/>五中队
                            <input type="radio" name="unit" value="六中队"  style="margin-left:20px"/>六中队<br/>
                            <input type="radio" name="unit" value="三大队"  style="margin-left:20px"/>三大队
                            <input type="radio" name="unit" value="七中队"  style="margin-left:20px"/>七中队
                            <input type="radio" name="unit" value="八中队"  style="margin-left:20px"/>八中队
                            <input type="radio" name="unit" value="九中队"  style="margin-left:20px"/>九中队<br/>
                            <input type="radio" name="unit" value="勤务中队"  style="margin-left:20px"/>勤务中队
                            <input type="radio" name="unit" value="化验室"  style="margin-left:20px"/>化验室
                            <input type="radio" name="unit" value="修理所仓库"  style="margin-left:20px"/>修理所仓库
                            <input type="radio" name="unit" value="卫生队"  style="margin-left:20px"/>卫生队
                        </p>
                    </div>
                    <div>
                        <span>新闻内容:</span>
                        <textarea id="descr" name="descr" rows="15" style="width:900px"></textarea>
                    </div>
                    <div>
                        <input type="submit" id="btnPass" value="提交" />
                    </div>
                </form>
            </div>

        </section><!-- /.content -->
        <%--
        <c:import url="../footer.jsp"></c:import>
        --%>
    </aside><!-- /.right-side -->

</div>
</body>
</html>
