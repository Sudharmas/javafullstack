<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- this file will be displayed after redirecting -->
member jsp file.
<br/>
username:<%= request.getParameter("username") %><br/>
password:<%= request.getParameter("password") %>
</body>
</html>