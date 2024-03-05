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
language:
<%-- here we use an array to get and store all langauges that are marked in the webpage --%>
<%
String[] language = request.getParameterValues("language");//we use getParameterValues() to get all values that are selected and store it in an array
if(language!=null){
	for(int i=0;i<language.length;i++){
		out.println(language[i]);
	}
}
%><br/>
country:<%= request.getParameter("country") %><br/>
</body>
</html>
