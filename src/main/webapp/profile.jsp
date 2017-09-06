<%@ page import="java.math.BigDecimal" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
          integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<a href="index.jsp">
    <img class="check" src="http://www.freeiconspng.com/uploads/red-flower-icon-18.png" width="200px">
</a>

<br>
<label>Hello, <%=(String) request.getAttribute("un")%></label><br>
<label>Your balance: <%=(BigDecimal) request.getAttribute("bal")%></label><br>
<label>Your discount: <%=(Integer) request.getAttribute("disc")%></label>

<form action="logout" method="post">
    <input type="submit" value="Logout" class="btn btn-danger"/>
</form>
</body>
</html>
