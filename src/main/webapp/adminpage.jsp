<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin page</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
          integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<h1 class="center">ADMIN PAGE</h1>
<div>
    <table class="table">
        <tr>
            <th>ID</th>
            <th>Create Date</th>
            <th>Complete Date</th>
            <th>User</th>
            <th>Subtotal</th>
        </tr>
        <%--<c:forEach items="${flowers}" var="iter" varStatus="rowStatus">--%>
        <%--<tr>--%>
        <%--<td>${iter.id}</td>--%>
        <%--<td>${iter.name}</td>--%>
        <%--<td>${iter.price}</td>--%>
        <%--<td>${iter.quantity}</td>--%>
        <%--</tr>--%>
        <%--</c:forEach>--%>
    </table>
</div>
</body>
</html>