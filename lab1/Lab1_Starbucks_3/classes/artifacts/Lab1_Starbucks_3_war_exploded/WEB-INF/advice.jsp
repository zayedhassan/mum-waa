<%--
  Created by IntelliJ IDEA.
  User: zayed
  Date: 9/30/2019
  Time: 4:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="../action/login" method="get">
    Starbuck's ${roast.toUpperCase()} Roast Coffees:
    <table>
        <c:forEach items="${advice}" var="item" varStatus="loop">
           ${loop.index%2 == 0 ? ' <tr style="background-color:cyan;">' : '<tr style="background-color:yellow">'}
            <td>${item}</td>
            </tr>
        </c:forEach>
    </table>
    <input type="submit" value="Back">
</body>
</html>

