<%--
  Created by IntelliJ IDEA.
  User: zhengnawei
  Date: 2017/11/3
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/common/bootstrap.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/common/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/home/bootsnav.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/home/index.css">

<script type="text/javascript" src="${pageContext.request.contextPath}/js/common/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/common/bootstrap.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/home/bootsnav.js"></script>


<div id="titleDiv" class="row">
    <div class="col-lg-4">
        <h3 id="webTitleH3">黄金五支队</h3>
    </div>
    <div class="col-lg-8" style="height: 120px;">
        <nav class="navbar navbar-default navbar-mobile bootsnav on" style="margin-top:20px;">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-menu">
                    <i class="fa fa-bars"></i>
                </button>
            </div>
            <div class="collapse navbar-collapse" id="navbar-menu">
                <ul class="nav navbar-nav" data-in="fadeInDown" data-out="fadeOutUp">
                    <li><a href="#">首页</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">机关</a>
                        <ul class="dropdown-menu animated">
                            <li><a href="#">司令部</a></li>
                            <li><a href="#">政治处</a></li>
                            <li><a href="#">后勤处</a></li>
                        </ul>
                    </li>

                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">一大队</a>
                        <ul class="dropdown-menu animated">
                            <li><a href="#">一中队</a></li>
                            <li><a href="#">二中队</a></li>
                        </ul>
                    </li>

                    <li><a href="#">二大队</a></li>
                    <li><a href="#">三大队</a></li>
                    <li><a href="#">直属队</a></li>
                </ul>
            </div>
        </nav>
    </div>

</div>


