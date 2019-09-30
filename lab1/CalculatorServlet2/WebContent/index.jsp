<%--
  Created by IntelliJ IDEA.
  User: zayed
  Date: 9/30/2019
  Time: 2:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Calculate</title>
</head>
<body>
<%
    RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/calculator.jsp");
    rd.forward(request,response);
%>

</body>
</html>