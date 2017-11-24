<%--
  Created by IntelliJ IDEA.
  User: zhengnawei
  Date: 2017/11/3
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div id="titleDiv" class="row">
    <div class="col-lg-3" style="padding-top: 40px;">
        <img class="img-responsive center-block" src="${pageContext.request.contextPath}/image/home/logo.png"/>
    </div>
    <div class="col-lg-9" style="height: 120px;">
        <nav class="navbar navbar-default navbar-mobile bootsnav on" style="margin-top:20px;">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-menu">
                    <i class="fa fa-bars"></i>
                </button>
            </div>
            <div class="collapse navbar-collapse" id="navbar-menu">
                <ul class="nav navbar-nav" data-in="fadeInDown" data-out="fadeOutUp">
                    <li><a href="${pageContext.request.contextPath}/index">首页</a></li>
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
                            <li><a href="${pageContext.request.contextPath}/1zhongdui">一中队</a></li>
                            <li><a href="${pageContext.request.contextPath}/2zhongdui">二中队</a></li>
                            <li><a href="${pageContext.request.contextPath}/3zhongdui">三中队</a></li>
                        </ul>
                    </li>

                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">二大队</a>
                        <ul class="dropdown-menu animated">
                            <li><a href="${pageContext.request.contextPath}/4zhongdui">四中队</a></li>
                            <li><a href="${pageContext.request.contextPath}/5zhongdui">五中队</a></li>
                            <li><a href="${pageContext.request.contextPath}/6zhongdui">六中队</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">三大队</a>
                        <ul class="dropdown-menu animated">
                            <li><a href="${pageContext.request.contextPath}/7zhongdui">七中队</a></li>
                            <li><a href="${pageContext.request.contextPath}/8zhongdui">八中队</a></li>
                            <li><a href="${pageContext.request.contextPath}/9zhongdui">九中队</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">直属队</a>
                        <ul class="dropdown-menu animated">
                            <li><a href="${pageContext.request.contextPath}/qingwuzongdui">勤务中队</a></li>
                            <li><a href="${pageContext.request.contextPath}/huayanshi">化验室</a></li>
                            <li><a href="${pageContext.request.contextPath}/weishengdui">卫生队</a></li>
                            <li><a href="${pageContext.request.contextPath}/xiulisuo">修理所仓库</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
    </div>

</div>


