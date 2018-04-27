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
</head>
<body>
    <div>
        <form action="${pageContext.request.contextPath}/postCode.action" method="post">
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
    </div>
</body>
</html>
