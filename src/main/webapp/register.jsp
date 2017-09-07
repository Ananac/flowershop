
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register form</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
          integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">
</head>

<script type="text/javascript">
    function validateForm() {
        var a = document.forms["Form"]["inputUsername"].value;
        var b = document.forms["Form"]["inputPassword"].value;
        var c = document.forms["Form"]["inputCPassword"].value;
        var d = document.forms["Form"]["inputFullName"].value;
        var e = document.forms["Form"]["inputCity"].value;
        var f = document.forms["Form"]["inputAddress"].value;
        var g = document.forms["Form"]["inputZipcode"].value;
        if (a == null || a == "") {
            alert("Please fill Username field");
            return false;
        }
        if (b == null || b == "") {
            alert("Please fill Password field");
            return false;
        }
        if (c == null || c == "") {
            alert("Please fill Confirm password field");
            return false;
        }
        if (b != c) {
            alert("Passwords not equal");
            return false;
        }

        if (d == null || d == "") {
            alert("Please fill Full name field");
            return false;
        }
        if (e == null || e == "") {
            alert("Please fill City field");
            return false;
        }
        if (f == null || f == "") {
            alert("Please fill Address field");
            return false;

        }
        if (g == null || g == "") {
            alert("Please fill Zip code field");
            return false;
        }

    }
</script>


<body>
<div class="center hero-unit">
    <form method="post" name="Auth" id="Auth" onsubmit="return validateForm()" action="register">

        <label for="inputUsername">Username</label>
        <input type="text" class="form-control" id="inputUsername" name="inputUsername" placeholder="Username"><br/>


        <label for="inputPassword">Password</label>
        <input type="password" class="form-control" id="inputPassword" name="inputPassword" placeholder="Password"><br/>

        <label for="inputCPassword">Confirm password</label>
        <input type="password" class="form-control" id="inputCPassword" name="inputCPassword"
               placeholder="Confirm password"><br/>
        <hr>

        <label for="inputFullName">Full name</label>
        <input type="text" class="form-control" id="inputFullName" name="inputFullName" placeholder="Full name"><br/>

        <label for="inputCity">City</label>
        <input type="text" class="form-control" id="inputCity" name="inputCity" placeholder="City"><br/>

        <label for="inputZipcode">Zip code</label>
        <input type="number" class="form-control" id="inputZipcode" name="inputZipcode" placeholder="Zip code"><br/>

        <label for="inputAddress">Address</label>
        <input type="text" class="form-control" id="inputAddress" name="inputAddress" placeholder="Address"><br/>
        <hr>
        <input type="submit" class="btn btn-large btn-danger"/>
    </form>
</div>
</body>
</html>

