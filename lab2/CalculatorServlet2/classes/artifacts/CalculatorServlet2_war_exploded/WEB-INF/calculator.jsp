<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<form action="calculate" method="post">
    <input type = "text" name = "add1" size = "2"  value = "${calculator.add1}" />+
    <input type = "text" name = "add2" value = "${calculator.add1}" size = "2"/>=<input type = "text" name = "sum" value = "${calculator.sum}"  size = "2" readonly/><br/>
    <input type = "text" name = "mult1" value = "${calculator.mult1}" size = "2"/>*
    <input type = "text" name = "mult2" value = "${calculator.mult2}"  size = "2"/>=<input type = "text" name = "product" value = "${calculator.product}"   size = "2" readonly/><br/>
    <input type = "submit" value = "Submit"/>
</form>
</body>
</html>
