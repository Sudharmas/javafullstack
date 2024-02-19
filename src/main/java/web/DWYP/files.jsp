<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Files in JSP</h1>
<hr/>
<%@ include file="files.txt" %>
<br/>
<jsp:include page = "files.txt"></jsp:include>
<%-- <jsp:include page = "javaa.java"></jsp:include> --%>
</body>
</html>