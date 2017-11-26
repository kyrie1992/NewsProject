<%--
  Created by IntelliJ IDEA.
  User: zhengnawei
  Date: 2017/11/26
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="../common/titlefiles.jsp" %>
<script type="text/javascript" src="${ctx}/js/admin/ie-emulation-modes-warning.js"></script>
<script type="text/javascript" src="${ctx}/js/admin/ie10-viewport-bug-workaround.js"></script>
<script type="text/javascript" src="${ctx}/js/admin/index.js"></script>
<link rel="stylesheet" type="text/css" href="${ctx}/css/admin/ie10-viewport-bug-workaround.css">
<link rel="stylesheet" type="text/css" href="${ctx}/css/admin/signin.css">
<html>
<head>
    <title>后台管理主页</title>
</head>
<body>
<div class="container">

    <form class="form-signin">
        <h2 class="form-signin-heading">请登录</h2>
        <label for="inputEmail" class="sr-only">用户名</label>
        <input type="text" id="inputEmail" class="form-control" placeholder="用户名" required autofocus>
        <label for="inputPassword" class="sr-only">密码</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="密码" required>
       <%-- <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> Remember me
            </label>
        </div>--%>
        <button class="btn btn-lg btn-primary btn-block" type="button" onclick="loginAdminBtnClick();">登录</button>
    </form>
</div>

</body>
</html>
