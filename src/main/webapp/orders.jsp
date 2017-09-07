<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Orders</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
          integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="center">
    <form id="order">
        <table class="table" id="orders">
            <thead bgcolor="#dc3545">
            <tr>
                <th>ID</th>
                <th>User</th>
                <th>Create Date</th>
                <th>Complete Date</th>
                <th>Total</th>
                <th>Status</th>
                <th>Close order</th>
            </tr>
            </thead>
            <%--<c:forEach items="${f}" var="iter" varStatus="rowStatus">--%>
            <%--<tr>--%>
            <%--<td>${iter.name}</td>--%>
            <%--<td>${iter.price} &#8381;</td>--%>
            <%--<td>${iter.quantity}</td>--%>
            <%--<td width="20%"><input type="number" class="form-control" id="amount" name="amount" placeholder="0">--%>
            <%--</td>--%>
            <%--</tr>--%>
            <%--</c:forEach>--%>
        </table>
    </form>
</div>

</body>
</html>

