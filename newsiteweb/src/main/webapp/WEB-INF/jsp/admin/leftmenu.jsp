<%--
  Created by IntelliJ IDEA.
  User: zhengnawei
  Date: 2017/11/26
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<script type="text/javascript">
    ctx= "${ctx}";
</script>
<aside class="left-side sidebar-offcanvas">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="${ctx}/image/common/avatar.png" class="img-circle" alt="User Image" />
            </div>
            <div class="pull-left info">
                <p>欢迎, ${sessionScope.currentUser.username}</p>
                <a href="${ctx}/admin/logout"><i class="fa fa-circle text-success"></i> 退出</a>
            </div>
        </div>
        <!-- search form -->
        <form action="#" method="get" class="sidebar-form">
            <div class="input-group">
                <input type="text" name="q" class="form-control" placeholder="暂未实现"/>
                <span class="input-group-btn">
                                        <button type='submit' name='seach' id='search-btn' class="btn btn-flat"><i class="fa fa-search"></i></button>
                                    </span>
            </div>
        </form>
        <!-- /.search form -->
        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu">
            <li class="active" id="newsListLi">
                <a href="${ctx}/manager/newslist">
                    <i class="fa fa-dashboard"></i> <span>新闻列表</span>
                </a>
            </li>
            <li id="newsPublishLi">
                <a href="${ctx}/manager/newspublish">
                    <i class="fa fa-gavel"></i> <span>新闻发布</span>
                </a>
            </li>

            <li id="userManagerLi">
                <a href="${ctx}/manager/usermanager">
                    <i class="fa fa-users"></i> <span>用户管理</span>
                </a>
            </li>
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>
