<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ page import="javaweb.java1,java.util.Date" %>
<meta charset="UTF-8">
<title>JSP File</title>
</head>
<body>
<%= new java1().s1() %>
<% out.print(new Date()); %>
</body>
</html>