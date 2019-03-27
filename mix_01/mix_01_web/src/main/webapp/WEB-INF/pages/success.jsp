<%--
  Created by IntelliJ IDEA.
  User: ZY
  Date: 2019/3/21
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>success</title>
</head>
<h1 align="center">SUCCESS!</h1><br><br><br><br><br>
<body>

    <table border="1" cellspacing="0" cellpadding="10" align="center">
        <c:forEach items="${list}" var="account">
            <tr>
                <td>${account.id}</td>
                <td>${account.name}</td>
                <td>${account.money}</td>
            </tr>
        </c:forEach>
    </table>

    <table border="1" cellspacing="0" cellpadding="10" align="center">
        <c:forEach items="${account}" var="acc">
            <tr>
                <td>${acc.id}</td>
                <td>${acc.name}</td>
                <td>${acc.money}</td>
            </tr>
        </c:forEach>
    </table>



</body>
</html>
