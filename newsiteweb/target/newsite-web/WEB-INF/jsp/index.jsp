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
    <div id="picDiv" class="row" style="height: 500px;">
        <img  style="width:100%;height: 100%;" src="${pageContext.request.contextPath}/image/home/index_bg.png"/>
    </div>

    <div id="newsDiv" class="row">

        <div id="leftNewsDiv" class="col-lg-2 col-md-2">
            <div class="list-group">
                <a href="#" class="list-group-item active">
                    新闻动态
                </a>
                <a href="#" class="list-group-item">公告公示</a>
                <a href="#" class="list-group-item">领导活动</a>
                <a href="#" class="list-group-item">军事工作</a>
                <a href="#" class="list-group-item">政治工作</a>
                <a href="#" class="list-group-item">后勤工作</a>
                <a href="#" class="list-group-item">中心工作</a>
            </div>
            <div class="list-group">
                <a href="#" class="list-group-item active">
                    站内链接
                </a>
                <a href="#" class="list-group-item">指挥部</a>
                <a href="#" class="list-group-item">总队</a>
                <a href="#" class="list-group-item">武警总队</a>
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
                            <a href="${pageContext.request.contextPath}/news/detail" target="view_window">文章表题</a>
                        </div>
                        <div class="pull-right">
                            <label>[ 公示公告 ]</label>
                            <label>2017-11-01</label>
                        </div>
                    </li>

                    <li>
                        <div class="pull-left">
                            <a href="#">新小麦最低收购价政策更具导向性</a>
                        </div>
                        <div class="pull-right">
                            <label>[ 军事动态 ]</label>
                            <label>2017-11-01</label>
                        </div>
                    </li>
                    <li>
                        <div class="pull-left">
                            <a href="#">新小麦最低收购价政策更具导向性</a>
                        </div>
                        <div class="pull-right">
                            <label>[ 军事动态 ]</label>
                            <label>2017-11-01</label>
                        </div>
                    </li>
                    <li>
                        <div class="pull-left">
                            <a href="#">新小麦最低收购价政策更具导向性</a>
                        </div>
                        <div class="pull-right">
                            <label>[ 军事动态 ]</label>
                            <label>2017-11-01</label>
                        </div>
                    </li>

                    <li>
                        <div class="pull-left">
                            <a href="#">新小麦最低收购价政策更具导向性</a>
                        </div>
                        <div class="pull-right">
                            <label>[ 军事动态 ]</label>
                            <label>2017-11-01</label>
                        </div>
                    </li>
                    <li>
                        <div class="pull-left">
                            <a href="#">新小麦最低收购价政策更具导向性</a>
                        </div>
                        <div class="pull-right">
                            <label>[ 军事动态 ]</label>
                            <label>2017-11-01</label>
                        </div>
                    </li>
                    <li>
                        <div class="pull-left">
                            <a href="#">新小麦最低收购价政策更具导向性</a>
                        </div>
                        <div class="pull-right">
                            <label>[ 军事动态 ]</label>
                            <label>2017-11-01</label>
                        </div>
                    </li>
                    <li>
                        <div class="pull-left">
                            <a href="#">新小麦最低收购价政策更具导向性</a>
                        </div>
                        <div class="pull-right">
                            <label>[ 军事动态 ]</label>
                            <label>2017-11-01</label>
                        </div>
                    </li>
                    <li>
                        <div class="pull-left">
                            <a href="#">新小麦最低收购价政策更具导向性</a>
                        </div>
                        <div class="pull-right">
                            <label>[ 军事动态 ]</label>
                            <label>2017-11-01</label>
                        </div>
                    </li>
                    <li>
                        <div class="pull-left">
                            <a href="#">新小麦最低收购价政策更具导向性</a>
                        </div>
                        <div class="pull-right">
                            <label>[ 军事动态 ]</label>
                            <label>2017-11-01</label>
                        </div>
                    </li>
                    <li>
                        <div class="pull-left">
                            <a href="#">新小麦最低收购价政策更具导向性</a>
                        </div>
                        <div class="pull-right">
                            <label>[ 军事动态 ]</label>
                            <label>2017-11-01</label>
                        </div>
                    </li>
                    <li>
                        <div class="pull-left">
                            <a href="#">新小麦最低收购价政策更具导向性</a>
                        </div>
                        <div class="pull-right">
                            <label>[ 军事动态 ]</label>
                            <label>2017-11-01</label>
                        </div>
                    </li>
                    <li>
                        <div class="pull-left">
                            <a href="#">新小麦最低收购价政策更具导向性</a>
                        </div>
                        <div class="pull-right">
                            <label>[ 军事动态 ]</label>
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
