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

        </section><!-- /.content -->
        <c:import url="../footer.jsp"></c:import>
    </aside><!-- /.right-side -->

</div>
</body>
</html>
