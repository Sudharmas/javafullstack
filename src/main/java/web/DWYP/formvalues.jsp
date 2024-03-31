<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- jsp:useBean is inbulit java function which is used for set and getproperties in various files,the "class" is path to file where logic part for all variables will be done. -->
<!-- id is unique, the id is used in the "name" attributes of set and getproperties ,to specify the sa,e variable in both ste and get properties  -->
<!-- property attribute will specify the variable which will be used to take input and store and also processed in servlet file. -->
<jsp:useBean id="Beans" class="beans.javabeans" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="Beans"/>
<!-- fname and l_name is also found in servlet file with same name. -->
firstname:<jsp:getProperty property="fname" name="Beans"/>
<br/>
lastname:<jsp:getProperty property="l_name" name="Beans"/>
</body>
</html>
