<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- this code is used to import a file inside jsp file and acces contents of that file --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Files in JSP</h1>
<hr/>
<%-- including fil with file name,syntax: @ include file="filename" --%>
<%@ include file="files.txt" %>
<br/>
<%-- we can also include files using jsp tag,syntax -> <jsp:include page="filename"> --%>
<jsp:include page = "files.txt"></jsp:include>
</body>
</html>
