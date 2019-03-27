<%--
  Created by IntelliJ IDEA.
  User: ZY
  Date: 2019/3/21
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
    <script src="js/jquery.min.js"></script>
    <%--<script>--%>

    <%--$(function () {--%>
    <%--$("#findAll").click(function () {--%>
    <%----%>
    <%--});--%>
    <%--});--%>

    <%--</script>--%>
</head>
<body>
<form action="account/findAll" method="post" id="findAll"><br>
    <input type="submit" value="FindAll">
</form>
<br>
<br>
<br>
<form action="account/findById" method="post">
    请输入想查询的ID:<input type="text" name="findId"><br>
    <input type="submit" value="FindByID">
</form>
<br>
<br>
<br>
<form action="account/transfer" method="post">
    转出账户ID:<input type="text" name="outAccount"><br>
    转入账户ID:<input type="text" name="targetAccount"><br>
    转账金额:<input type="text" name="money"><br>
    <input type="submit" value="TRANSFER">
</form>
<br>
</body>
</html>
