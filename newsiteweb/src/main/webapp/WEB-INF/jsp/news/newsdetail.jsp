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
<head>
    <title>首页</title>
</head>
<body>
<div class="container">
    <%@ include file="../common/title.jsp" %>

    <div id="newsDetailDiv" class="row">
        <div class="page-header">
            <h3><c:out value="${newsTitle}"></c:out> <small>一中队新闻</small></h3>
        </div>
        <div class="col-lg-10 col-lg-offset-1" style="height:500px;font-size: 15px;">
            <p>新中国成立之初，我国黄金年产量仅为4.07吨。此后长达30年，黄金生产始终在低水平徘徊，平均年产量不足10吨，远远不能满足经济建设的需要。 </p>

            <p>1978年，中国改革开放之初，国家急需增加外汇和黄金储备，加速国民经济建设。中国改革开放的总设计师邓小平把重担压在了主抓黄金工作的王震同志肩上。</p>

            <p>
            受此重任的王震和中国地质学家们经过深入调查研究后，向中央建言：中国不贫金，中国缺少的是专业化的找金队伍。当年带领359旅在南泥湾创造垦荒奇迹的胡子将军，再一次想到了部队：尽快组建一支军事化的专业找金队伍，作为黄金工业的先锋军，以便进行大规模、大范围的黄金矿产资源勘查活动。
            “让部队去找金子！”王震的建议，得到了中央的采纳。1979年3月，一支特殊部队——中国黄金部队诞生了(当时为解放军基建工程兵，1985年列入武警部队序列)。
            </p>

        </div>


    </div>

    <%@ include file="../common/footer.jsp" %>
</div>
</body>
</html>
