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
        addFoucsLi($("#noticePublishLi"));
    });
</script>
<html>
<head>
    <title>公告发布</title>
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
                <h1>发布公告<small>共100条</small></h1>
            </div>
            <div class="newcontainer" id="news_insert" style="font-size:20px">
                <form name="mainForm" action="<%= request.getContextPath()%>/notice/save" method="post">
                    <div>
                        <span>公告标题:</span><input type="text" id="title" name="title">
                    </div>
                    <hr/>
                    <div>
                        <span>公告内容:</span>
                        <textarea id="content" name="content" rows="15" style="width:900px"></textarea>
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
