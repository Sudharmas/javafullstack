<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="Beans" class="beans.javabeans" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="Beans"/>
firstname:<jsp:getProperty property="fname" name="Beans"/>
<br/>
lastname:<jsp:getProperty property="l_name" name="Beans"/>
</body>
</html>