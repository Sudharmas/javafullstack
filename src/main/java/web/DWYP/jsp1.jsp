<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%-- here script tag is used to import packages to file and also a java file to this code --%>
<%@ page import="javaweb.java1,java.util.Date" %>
<meta charset="UTF-8">
<title>JSP File</title>
</head>
<body>
<%-- here we are accessing the function s1 within class java1 --%>
<%= new java1().s1() %>
<%-- printing date using inbulit function inside a  package called Date--%>
<% out.print(new Date()); %>
</body>
</html>
