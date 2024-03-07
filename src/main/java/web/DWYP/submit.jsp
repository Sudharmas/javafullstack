<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Submit</title>
</head>
<body>
<%-- request.getParameter() returns the value or parameter that is selected in web page and displayes in this page,it fetches the data using the name-identifier given inside ()
,that is if name of an input tag is 'name' then it searches for parameter that has 'name' as its name-identifier. --%>
<%-- example:- <input type="text" name="lastname"></input> => here name="lastname" ,therfore, name-identifier would be getParameter("lastname"); --%>
Name:<%= request.getParameter("name") %><br/>
gender:<%= request.getParameter("gender") %><br/>
language:
<%-- here we use an array to get and store all langauges that are marked in the webpage --%>
<%
String[] language = request.getParameterValues("language");//we use getParameterValues() to get all values that are selected and store it in an array
if(language!=null){
	for(int i=0;i<language.length;i++){
		out.println(language[i]);//printing all values stored in array of languages
	}
}
%><br/>
country:<%= request.getParameter("country") %><br/>
</body>
</html>
