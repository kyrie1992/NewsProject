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
     addFoucsLi($("#newsListLi"));
   });
</script>
<html>
<head>
    <title>新闻列表</title>
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
                <h1>新闻列表<small>共100条</small></h1>
            </div>
            <div class="row">
                <table class="table">
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>Column heading</th>
                        <th>Column heading</th>
                        <th>Column heading</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr class="active">
                        <th scope="row">1</th>
                        <td>Column content</td>
                        <td>Column content</td>
                        <td>Column content</td>
                    </tr>
                    <tr>
                        <th scope="row">2</th>
                        <td>Column content</td>
                        <td>Column content</td>
                        <td>Column content</td>
                    </tr>
                    <tr class="success">
                        <th scope="row">3</th>
                        <td>Column content</td>
                        <td>Column content</td>
                        <td>Column content</td>
                    </tr>
                    <tr>
                        <th scope="row">4</th>
                        <td>Column content</td>
                        <td>Column content</td>
                        <td>Column content</td>
                    </tr>
                    <tr class="info">
                        <th scope="row">5</th>
                        <td>Column content</td>
                        <td>Column content</td>
                        <td>Column content</td>
                    </tr>
                    <tr>
                        <th scope="row">6</th>
                        <td>Column content</td>
                        <td>Column content</td>
                        <td>Column content</td>
                    </tr>
                    <tr class="warning">
                        <th scope="row">7</th>
                        <td>Column content</td>
                        <td>Column content</td>
                        <td>Column content</td>
                    </tr>
                    <tr>
                        <th scope="row">8</th>
                        <td>Column content</td>
                        <td>Column content</td>
                        <td>Column content</td>
                    </tr>
                    <tr class="danger">
                        <th scope="row">9</th>
                        <td>Column content</td>
                        <td>Column content</td>
                        <td>Column content</td>
                    </tr>
                    </tbody>
                </table>

            </div>


        </section><!-- /.content -->
        <c:import url="../footer.jsp"></c:import>
    </aside><!-- /.right-side -->

</div>
</body>
</html>
