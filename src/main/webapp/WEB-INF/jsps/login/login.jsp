<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>


<form action="login" method="post">
<pre>
<h2>Login Page</h2>
Email Id :  <input type="text" name="email">
Password :  <input type="password" name="password">
<input type="submit" value="Login">

${msg}
</pre>

</form>

</body>
</html>