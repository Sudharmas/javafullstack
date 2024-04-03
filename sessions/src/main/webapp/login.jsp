<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login form</title>
</head>
<body>
<!-- action of this form is submitted to sessioninjava file where username and password is checked and if correct a session will be created. -->
<form action="<%= request.getContextPath() %>/sessionsinjava" method ="post">
username:<input type="text" name="username">
password:<input type="text" name="password">
<input type="submit" value="submit">

</form>
</body>
</html>
