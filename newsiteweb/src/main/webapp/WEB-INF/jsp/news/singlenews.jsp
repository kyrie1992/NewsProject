<%--
  Created by IntelliJ IDEA.
  User: zhengnawei
  Date: 2017/11/6
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../common/titlefiles.jsp" %>
<html>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/news/singlenews.css">
<head>
    <title>一中队首页</title>
</head>
<body>
    <div class="container">
        <div class="page-header row">
            <h3>黄金五支队 <small>一中队</small></h3>
        </div>
        <div class="middleteamtitlediv">
            <ul>
                <li><a href="#">首页</a></li>
                <li><a href="#">军事工作</a></li>
                <li><a href="#">政治工作</a></li>
                <li><a href="#">后勤工作</a></li>
                <li><a href="#">中心工作</a></li>
                <li><a href="#">中队简介</a></li>
            </ul>
        </div>

        <div>
            <img class="img-responsive center-block" src="${pageContext.request.contextPath}/image/news/flogo.jpg"/>
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
                                <a href="${pageContext.request.contextPath}/news/detail" target="view_window">一支队</a>
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

        <%@ include file="../common/footer.jsp" %>

    </div>
</body>
</html>
