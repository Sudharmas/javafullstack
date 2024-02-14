<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!String message() {
		return "studyeasy";
	}%>
	<%--we can also use script tag to declare variables and also write functions in it/java code in it. --%>
	<%
	int x = 25;
	out.println("Value of x");//print statement to print anything in webpage

	out.println(x);
	//response.sendRedirect ("https://www.google.com");//used to redirect to another page
	%>
	<%=message()%>

</body>
</html>