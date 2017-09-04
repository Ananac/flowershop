<%--
  Created by IntelliJ IDEA.
  User: denis.bazylev
  Date: 04.09.2017
  Time: 9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register form</title>
    <link rel="stylesheet" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div id="inp">
    <form method="post" action="register"><br/>
        <label for="inputUsername" class="col-sm-2 control-label">Username</label>
        <input type="text" class="form-control" id="inputUsername" name="inputUsername" placeholder="Username"><br/>


        <label for="inputPassword" class="col-sm-2 control-label">Password</label>
        <input type="password" class="form-control" id="inputPassword" name="inputPassword" placeholder="Password"><br/>

        <label for="inputCPassword" class="col-sm-2 control-label">Confirm password</label>
        <input type="password" class="form-control" id="inputCPassword" name="inputCPassword"
               placeholder="Confirm password"><br/>

        <label for="inputFullName" class="col-sm-2 control-label">Full name</label>
        <input type="text" class="form-control" id="inputFullName" name="inputFullName" placeholder="Full name"><br/>

        <label for="inputCity" class="col-sm-2 control-label">City</label>
        <input type="text" class="form-control" id="inputCity" name="inputCity" placeholder="City"><br/>

        <label for="inputAddress" class="col-sm-2 control-label">Address</label>
        <input type="text" class="form-control" id="inputAddress" name="inputAddress" placeholder="Address"><br/>

        <input type="submit" class="btn btn-large btn-primary"/>
    </form>
</div>
</body>
</html>

