<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- same id is used in other file,where these values will be displayed -->
<jsp:useBean id="Beans" class="beans.javabeans" scope="session" ></jsp:useBean>
<form action="formvalues.jsp">
<!-- inside formvalues.jsp sa,e id, name,class will be used,else eroor will be thrown -->
first name: <input type="text" name="fname" value='<jsp:getProperty property="fname" name="Beans"/>'>
<!-- getting values from get.jsp using scriptlet -->
last name: <input type="text" name="l_name" value='<jsp:getProperty property="l_name" name="Beans"/>'>
<input type="submit" value ="submit">
</form>
</body>
</html>
