<%--
  Created by IntelliJ IDEA.
  User: denis.bazylev
  Date: 05.09.2017
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
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
    <img class="check" src="https://icon-icons.com/icons2/894/PNG/512/Tick_Mark_icon-icons.com_69146.png">
</a>
<br>
<label>
    <%=(String) request.getAttribute("todo")%>
</label>
</body>
</html>
