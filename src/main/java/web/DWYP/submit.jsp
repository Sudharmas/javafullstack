<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Submit</title>
</head>
<body>
Name:<%= request.getParameter("name") %><br/>
gender:<%= request.getParameter("gender") %><br/>
language:<%= request.getParameter("language") %><br/>
country:<%= request.getParameter("country") %><br/>
</body>
</html>