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
    <script type="text/javascript">
        myFocus.set({
            id:'picBOX'
        })
    </script>
    <script type="text/javascript">
        myFocus.set({
            id:'picBOX1'
        })
    </script>
</head>
<body style="background-color:#ffffff ">
<div class="container">
    <%@ include file="./common/title.jsp" %>

    <div id="picDiv" class="row">
        <%--<img class="img-responsive center-block" src="${pageContext.request.contextPath}/image/home/index_bg.png"/>--%>
    </div>
    <%--
    myFocus
    --%>
    <div class="ad" id="picBOX">
        <div class="pic">
            <ul>
                <li> <img  src="${pageContext.request.contextPath}/image/home/1.jpg"/></li>
                <li> <img  src="${pageContext.request.contextPath}/image/home/2.jpg"/></li>
                <li> <img  src="${pageContext.request.contextPath}/image/home/3.jpg"/></li>
                <li> <img  src="${pageContext.request.contextPath}/image/home/4.jpg"/></li>
                <li> <img  src="${pageContext.request.contextPath}/image/home/5.jpg"/></li>
                <li> <img  src="${pageContext.request.contextPath}/image/home/6.jpg"/></li>
            </ul>
        </div>

    </div>

    <%@ include file="./common/zhanshi.jsp" %>

    <%--
   myFocus
   --%>
    111111111111111111111111111111111111111111111111
    <c:forEach var="notice" items="${noticeList}">
        <li><a href="${pageContext.request.contextPath}/notice/showNotice?id=${notice.noticeid}" target="view_window">${notice.title}</a></li>
    </c:forEach>
    <div id="newsDiv" class="row">

    <div id="leftNewsDiv" class="col-lg-2 col-md-2">
        <div class="list-group">
            <a href="#" class="list-group-item active">
                新闻动态
            </a>
            <a href="#" class="list-group-item">中心工作</a>
            <a href="#" class="list-group-item">军事工作</a>
            <a href="#" class="list-group-item">政治工作</a>
            <a href="#" class="list-group-item">后勤工作</a>

        <div class="list-group">
            <a href="#" class="list-group-item active">
                学习材料
            </a>
            <a href="#" class="list-group-item">会议纪要</a>
            <a href="#" class="list-group-item">领导讲话</a>
            <a href="#" class="list-group-item">经验交流</a>
            <a href="#" class="list-group-item">制度规定</a>

        </div>
    </div>
        <%--
        <div class="list-group">
            <a href="#" class="list-group-item active">
                站内链接
            </a>
            <a href="#" class="list-group-item">武警黄金指挥部</a>
            <a href="#" class="list-group-item">武警黄金第二总队</a>
            <a href="#" class="list-group-item">武警黄金第五支队荣誉室</a>
        </div>
        --%>

    </div>


    <div id="rightNewsDiv" class="col-lg-10 col-md-10">
        <%--
        <div class="page-header">
            <h4>新闻列表 <small>共20条</small></h4>
        </div>
        --%>
        <div id="newListDiv">
            <ul class="newListUL">
                <li>
                    <div class="pull-left">
                        <a href="${pageContext.request.contextPath}/news/detail" target="view_window">一中队立足岗位练兵提升通信保障效益</a>
                    </div>
                    <div class="pull-right">
                        <label>[ 公示公告 ]</label>
                        <label>2017-11-01</label>
                        </div>
                    </li>

                    <li>
                    <div class="pull-left">
                        <a href="#">五支队第六届运动会预赛阶段全面展开</a>
                    </div>
                    <div class="pull-right">
                        <label>[ 军事动态 ]</label>
                        <label>2017-11-01</label>
                    </div>
                </li>
                <li>
                    <div class="pull-left">
                        <a href="#">五支队第六届运动会预赛阶段全面展开</a>
                    </div>
                    <div class="pull-right">
                        <label>[ 军事动态 ]</label>
                        <label>2017-11-01</label>
                    </div>
                </li>
                <li>
                    <div class="pull-left">
                        <a href="#">五支队第六届运动会预赛阶段全面展开</a>
                    </div>
                    <div class="pull-right">
                        <label>[ 军事动态 ]</label>
                        <label>2017-11-01</label>
                    </div>
                </li>

                <li>
                    <div class="pull-left">
                        <a href="#">五支队第六届运动会预赛阶段全面展开</a>
                    </div>
                    <div class="pull-right">
                        <label>[ 军事动态 ]</label>
                        <label>2017-11-01</label>
                    </div>
                </li>
                <li>
                    <div class="pull-left">
                        <a href="#">五支队第六届运动会预赛阶段全面展开</a>
                    </div>
                    <div class="pull-right">
                        <label>[ 军事动态 ]</label>
                        <label>2017-11-01</label>
                    </div>
                </li>
                <li>
                    <div class="pull-left">
                        <a href="#">五支队第六届运动会预赛阶段全面展开</a>
                    </div>
                    <div class="pull-right">
                        <label>[ 军事动态 ]</label>
                        <label>2017-11-01</label>
                    </div>
                </li>
                <li>
                    <div class="pull-left">
                        <a href="#">五支队第六届运动会预赛阶段全面展开</a>
                    </div>
                    <div class="pull-right">
                        <label>[ 军事动态 ]</label>
                        <label>2017-11-01</label>
                    </div>
                </li>
                <li>
                    <div class="pull-left">
                        <a href="#">五支队第六届运动会预赛阶段全面展开</a>
                    </div>
                    <div class="pull-right">
                        <label>[ 军事动态 ]</label>
                        <label>2017-11-01</label>
                    </div>
                </li>
                <li>
                    <div class="pull-left">
                        <a href="#">五支队第六届运动会预赛阶段全面展开</a>
                    </div>
                    <div class="pull-right">
                        <label>[ 军事动态 ]</label>
                        <label>2017-11-01</label>
                    </div>
                </li>
                <li>
                    <div class="pull-left">
                        <a href="#">五支队第六届运动会预赛阶段全面展开</a>
                    </div>
                    <div class="pull-right">
                        <label>[ 军事动态 ]</label>
                        <label>2017-11-01</label>
                    </div>
                </li>
                <%--
                <li>
                    <div class="pull-left">
                        <a href="#">五支队第六届运动会预赛阶段全面展开</a>
                    </div>
                    <div class="pull-right">
                        <label>[ 军事动态]</label>
                        <label>2017-11-01</label>
                    </div>
                </li>
                <li>
                    <div class="pull-left">
                        <a href="#">五支队第六届运动会预赛阶段全面展开</a>
                    </div>
                    <div class="pull-right">
                        <label>[ 军事动态 ]</label>
                        <label>2017-11-01</label>
                    </div>
                </li>
                 --%>

            </ul>
            <%--
            <nav aria-label="...">
                <ul class="pager">
                    <li class="previous disabled"><a href="#"><span aria-hidden="true">&larr;</span> 上一页</a></li>
                    <li class="next"><a href="#">下一页 <span aria-hidden="true">&rarr;</span></a></li>
                </ul>
            </nav>
            --%>

        </div>
    </div>


</div>

<%--<%@ include file="common/body_up.jsp" %>--%>
    
    <div class="shijiuda">
    <a target="_blank" href="#"><img src="${pageContext.request.contextPath}/image/home/shijiuda.jpg"></a>
</div>
    <%@ include file="./common/link.jsp" %>
    <%--<%@ include file="common/body_down.jsp" %>--%>
    <%@ include file="./common/footer.jsp" %>
</div>
</body>
</html>
