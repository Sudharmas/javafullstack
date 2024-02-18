<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- this code snippet showsa some of the scripts taht can be used inside jsp file which can be used to write code inside html file using " <% %> " tag--%>--%>
<%-- this tag is used to write functions and print values and check relations --%>
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

	<%=message()%>   <%-- this is also used to call a function and also write import statements--%>

</body>
</html>
