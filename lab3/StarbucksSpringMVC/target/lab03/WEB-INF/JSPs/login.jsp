<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/30/2019
  Time: 4:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Starbuck's</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<div id="login">
    <p> Please Login to ask for advice</p>
    <form action="authenticate" method="post">
        <table>
            <tr><td class="left">Username:</td><td><input type="text" name="name"/></td></tr>
            <tr><td class="left">Password:</td><td><input type="password" name="password"/></td></tr>
            <tr><td></td><td><input type="submit" value="Log In"/></td></tr>
        </table>

    </form>
</div>
</body>

</html>
