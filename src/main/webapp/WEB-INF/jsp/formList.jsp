<%--
  Created by IntelliJ IDEA.
  User: CHT
  Date: 2018-4-27
  Time: 8:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %><%--开启el表达式--%>
<html>
<head>
    <title>表单页面</title>
    
    <style type="text/css">
        th{
            text-align: right;
        }
        td{
            text-align: left;
        }
    </style>
    <script type="application/javascript" src="/resources/js/jquery-3.3.1.js"></script>
</head>
<body>
    <div>
        <%--<form action="${pageContext.request.contextPath}/postCode.do" method="post">--%>
        <%--<form action="${pageContext.request.contextPath}/collect/commonTyps.do" method="post">--%>
        <form action="${pageContext.request.contextPath}/bean/beanParam.do" method="post">
            <table>
                <caption>用户注册</caption>
                <tr>
                    <th>用户名:</th>
                    <td><input type="text" name="userName" placeholder="请输入用户名"/></td>
                </tr>
                <tr>
                    <th>年龄:</th>
                    <td><input type="text" name="age" placeholder="请输入用年龄"/></td>
                </tr>
                <tr>
                    <th>身高:</th>
                    <td><input type="text" name="height" placeholder="请输入用身高"/></td>
                </tr>
                <tr>
                    <th>生日:</th>
                    <td><input type="text" name="date" placeholder="请输入用生日"/></td>
                </tr>
                <tr>
                    <td align="center" colspan="2">
                        <input type="submit"/>&nbsp;
                        <input type="reset"/>
                    </td>
                </tr>
            </table>
        </form>




        <hr/>




        <%--测试json参数和数据--%>

        <script type="application/javascript">
            $(function () {
                $("#testJson").click(function () {

                    var sendDate = {
                        userName:"测试json",
                        age:23,
                        height:178.5,
                        date:2018-12-23
                    };
                    $.ajax({
                        type: "POST",
                        url: "${pageContext.request.contextPath}json/demo.do",
                        contentType: "application/json;charset=UTF-8", //发送数据的格式
                        data: JSON.stringify(sendDate),
                        dataType: "json",
                        success: function(data){
                           alert(JSON.stringify(data));
                        }
                    });

                });
            });



        </script>
            <input type="button" id="testJson" value="json交互"/>
    </div>
</body>
</html>
