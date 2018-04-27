<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>

    <h2>此页面为：WEB-INF/jsp/success.jsp</h2>

    sucesses<br/>
    成功<br/>
    <hr/>
    java取值：<%=request.getAttribute("messege") %>
    <br/>
    ${requestScope.messege}
</head>
<body>

</body>
</html>
