<%--
  Created by IntelliJ IDEA.
  User: zhengnawei
  Date: 2017/11/3
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/common/bootstrap.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/common/bootstrap-treeview.css">

<script type="text/javascript" src="${pageContext.request.contextPath}/js/common/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/common/bootstrap.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/common/bootstrap-treeview.js"></script>
<html>
<head>
    <title>首页</title>
</head>
<style type="text/css">
    .greenClass{
        background-color: #c5f3c5;
    }
    .redClass{
        background-color: #ffd9d9;
    }
    .yellowClass{
        background-color: #f7f7d0;
    }
</style>
<body>
<div class="container">
    <h1>代码覆盖报告结果</h1>
    <%-- <div>
         <c:forEach items="${treeNodeList}" var="node">
             <p><c:out value="${node.nodeName}"/></p>
         </c:forEach>
     </div>--%>
    <div class="row">
        <div class="col-sm-12">
            <div id="treeview"/>
        </div>
    </div>
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog modal-lg">
            <div class="modal-content" style="height:700px;">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"
                            aria-hidden="true">×
                    </button>
                    <h4 class="modal-title" id="myModalLabel">
                        代码详情
                    </h4>
                </div>
                <div class="modal-body" id="modelBody" style="height:600px;">
                      <pre id="fileDetailDiv" style="height:600px;">

                     </pre>
                </div>
            <%--    <div class="modal-footer">
                    <button type="button" class="btn btn-default"
                            data-dismiss="modal">关闭
                    </button>
                </div>--%>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->


</div>

<%--树形结构展示--%>
<script type="text/javascript">

    /**
     * 创建节点对象
     * @param text
     * @param href
     * @param tags
     * @param nodes
     * @returns {Object}
     */
    function createTreeNode(text, href, tags, nodes) {
        var treeNode = new Object();
        treeNode.text = text;
        treeNode.href = href;
        var tagArray = new Array();
        tagArray.push(tags);
        treeNode.tags = tagArray;
        treeNode.nodes = nodes;
        return treeNode;
    }

    $(function () {
        var treeNodeList = new Array();
        <c:forEach items="${treeNodeList}" var="node">
        var nodesArray = new Array();
        <c:forEach items="${node.nodes}" var="node2">
        nodesArray.push(createTreeNode("<c:out value='${node2.text}'/>", "<c:out value='${node2.href}'/>", "<c:out value='${node2.tags}'/>", null))
        </c:forEach>
        treeNodeList.push(createTreeNode("<c:out value='${node.text}'/>", "<c:out value='${node.href}'/>", "<c:out value='${node.tags}'/>", nodesArray));
        </c:forEach>
        function getTree() {
            var data = [
                {
                    text: 'Parent 1',
                    href: '#parent1',
                    tags: ['4'],
                    nodes: [
                        {
                            text: 'Child 1',
                            href: '#child1',
                            tags: ['2'],
                            nodes: [
                                {
                                    text: 'Grandchild 1',
                                    href: '#grandchild1',
                                    tags: ['0']
                                },
                                {
                                    text: 'Grandchild 2',
                                    href: '#grandchild2',
                                    tags: ['0']
                                }
                            ]
                        },
                        {
                            text: 'Child 2',
                            href: '#child2',
                            tags: ['0']
                        }
                    ]
                },
                {
                    text: 'Parent 2',
                    href: '#parent2',
                    tags: ['0']
                },
                {
                    text: 'Parent 3',
                    href: '#parent3',
                    tags: ['0']
                },
                {
                    text: 'Parent 4',
                    href: '#parent4',
                    tags: ['0']
                },
                {
                    text: 'Parent 5',
                    href: '#parent5',
                    tags: ['0']
                }
            ];
            return data;
        }

        data = treeNodeList;
        $('#treeview').treeview({
            showTags: true,
            data: data,
            onNodeSelected: function (event, data) {
                //根据选中的节点去查找源代码
                var nodeLevel = data["href"].split("-").length;
                if (nodeLevel == 3) {
                    //根据选中的文件名字去服务器上查找
                    var fileName = data['text'];
                    getFileFromServer(fileName);
                } else {
                    return;
                }
            }
        });

        $('#treeview').treeview('collapseAll', { silent: true });

    });

    /**
     * 去服务端返回文件内容
     * @param fileName
     */
    function getFileFromServer(fileName) {
        $.ajax({
            type: "POST",
            url: "fileDetail",
            data: {fileName: fileName},
            dataType: "html",
            success: function (data) {
                $("#fileDetailDiv").html(data);
                var arr = $("#fileDetailDiv").html().split("\n");
                var text = "<ol>";
                $.each(arr,function(i,item){
                    if(item.trim()!=""){
                        text += "<li>"+ item +"</li>";
                    }
                });
                text += "</ol>";
                $("#fileDetailDiv").html(text);
                $("#myModal").modal('show');
            },
            error: function (e) {
                console.log(e);
            }
        });
    }

</script>
</body>
</html>
