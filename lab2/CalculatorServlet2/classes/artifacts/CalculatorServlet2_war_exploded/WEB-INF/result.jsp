<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <title>Calculator</title>
</head>
<style>
    ul{
        list-style:none;
        color:red;
    }
</style>
<body>
<c:if test="${fn:length(errors) > 0}">
    <ul>
        <c:forEach var="err" items="${errors}">
            <li class="error">${err}</li>
        </c:forEach>
    </ul>
</c:if>
<form action="calculate" method="post">
    <input type = "text" name = "add1" size = "2"  value = "${calculator.add1}" />+
    <input type = "text" name = "add2" value = "${calculator.add1}" size = "2"/>=<input type = "text" name = "sum" value = "${calculator.sum}"  size = "2" readonly/><br/>
    <input type = "text" name = "mult1" value = "${calculator.mult1}" size = "2"/>*
    <input type = "text" name = "mult2" value = "${calculator.mult2}"  size = "2"/>=<input type = "text" name = "product" value = "${calculator.product}"   size = "2" readonly/><br/>
    <input type = "submit" value = "Submit"/>
</form>
</body>
</html>
