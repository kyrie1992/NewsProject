<%--
  Created by IntelliJ IDEA.
  User: zhengnawei
  Date: 2017/11/3
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="./common/titlefiles.jsp" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<div class="container">
    <%@ include file="./common/title.jsp" %>
    <div id="picDiv" class="row">
        <img class="img-responsive center-block" src="${pageContext.request.contextPath}/image/home/index_bg.png"/>
    </div>

    <div id="newsDiv" class="row">

        <div id="leftNewsDiv" class="col-lg-2 col-md-2">
            <div class="list-group">
                <a href="#" class="list-group-item active">
                    新闻动态
                </a>
                <a href="#" class="list-group-item">公告公示</a>
                <a href="#" class="list-group-item">省市新闻</a>
                <a href="#" class="list-group-item">领导关怀</a>
                <a href="#" class="list-group-item">时事要点</a>
            </div>
            <div class="list-group">
                <a href="#" class="list-group-item active">
                    党的建设
                </a>
                <a href="#" class="list-group-item">组织建设</a>
            </div>
            <div class="list-group">
                <a href="#" class="list-group-item active">
                    建设新农村
                </a>
                <a href="#" class="list-group-item">乡风文明</a>
                <a href="#" class="list-group-item">村容整洁</a>
            </div>
            <div class="list-group">
                <a href="#" class="list-group-item active">
                    农业信息
                </a>
                <a href="#" class="list-group-item">农业科技</a>
                <a href="#" class="list-group-item">产品供求</a>
            </div>

        </div>


        <div id="rightNewsDiv" class="col-lg-10 col-md-10">
            <div class="page-header">
                <h4>新闻列表 <small>共20条</small></h4>
            </div>
            <div id="newListDiv">
                <ul class="newListUL">
                    <li>
                        <div class="pull-left">
                            <a href="${pageContext.request.contextPath}/news/detail">一支队</a>
                        </div>
                        <div class="pull-right">
                            <label>[ 乡风文明 ]</label>
                            <label>2017-11-01</label>
                        </div>
                    </li>

                    <li>
                        <div class="pull-left">
                            <a href="#">新小麦最低收购价政策更具导向性</a>
                        </div>
                        <div class="pull-right">
                            <label>[ 农业科技 ]</label>
                            <label>2017-11-01</label>
                        </div>
                    </li>
                    <li>
                        <div class="pull-left">
                            <a href="#">新小麦最低收购价政策更具导向性</a>
                        </div>
                        <div class="pull-right">
                            <label>[ 农业科技 ]</label>
                            <label>2017-11-01</label>
                        </div>
                    </li>
                    <li>
                        <div class="pull-left">
                            <a href="#">新小麦最低收购价政策更具导向性</a>
                        </div>
                        <div class="pull-right">
                            <label>[ 农业科技 ]</label>
                            <label>2017-11-01</label>
                        </div>
                    </li>

                    <li>
                        <div class="pull-left">
                            <a href="#">新小麦最低收购价政策更具导向性</a>
                        </div>
                        <div class="pull-right">
                            <label>[ 农业科技 ]</label>
                            <label>2017-11-01</label>
                        </div>
                    </li>
                    <li>
                        <div class="pull-left">
                            <a href="#">新小麦最低收购价政策更具导向性</a>
                        </div>
                        <div class="pull-right">
                            <label>[ 农业科技 ]</label>
                            <label>2017-11-01</label>
                        </div>
                    </li>
                    <li>
                        <div class="pull-left">
                            <a href="#">新小麦最低收购价政策更具导向性</a>
                        </div>
                        <div class="pull-right">
                            <label>[ 农业科技 ]</label>
                            <label>2017-11-01</label>
                        </div>
                    </li>
                    <li>
                        <div class="pull-left">
                            <a href="#">新小麦最低收购价政策更具导向性</a>
                        </div>
                        <div class="pull-right">
                            <label>[ 农业科技 ]</label>
                            <label>2017-11-01</label>
                        </div>
                    </li>
                    <li>
                        <div class="pull-left">
                            <a href="#">新小麦最低收购价政策更具导向性</a>
                        </div>
                        <div class="pull-right">
                            <label>[ 农业科技 ]</label>
                            <label>2017-11-01</label>
                        </div>
                    </li>
                    <li>
                        <div class="pull-left">
                            <a href="#">新小麦最低收购价政策更具导向性</a>
                        </div>
                        <div class="pull-right">
                            <label>[ 农业科技 ]</label>
                            <label>2017-11-01</label>
                        </div>
                    </li>
                    <li>
                        <div class="pull-left">
                            <a href="#">新小麦最低收购价政策更具导向性</a>
                        </div>
                        <div class="pull-right">
                            <label>[ 农业科技 ]</label>
                            <label>2017-11-01</label>
                        </div>
                    </li>
                    <li>
                        <div class="pull-left">
                            <a href="#">新小麦最低收购价政策更具导向性</a>
                        </div>
                        <div class="pull-right">
                            <label>[ 农业科技 ]</label>
                            <label>2017-11-01</label>
                        </div>
                    </li>
                    <li>
                        <div class="pull-left">
                            <a href="#">新小麦最低收购价政策更具导向性</a>
                        </div>
                        <div class="pull-right">
                            <label>[ 农业科技 ]</label>
                            <label>2017-11-01</label>
                        </div>
                    </li>

                </ul>
                <nav aria-label="...">
                    <ul class="pager">
                        <li class="previous disabled"><a href="#"><span aria-hidden="true">&larr;</span> 上一页</a></li>
                        <li class="next"><a href="#">下一页 <span aria-hidden="true">&rarr;</span></a></li>
                    </ul>
                </nav>

            </div>
        </div>


    </div>

    <%@ include file="./common/footer.jsp" %>
</div>
</body>
</html>
