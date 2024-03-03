<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="submit.jsp" method="post">
Name:<input type="text" name="name"><br/>
gender :<input type="radio" name="gender" value="male">Male
<input type="radio" name="gender" value="female">feMale<br/>
language:<input type="checkbox" name="language" value="english">English
<input type="checkbox" name="language" value="hindi">hindi
<input type="checkbox" name="language" value="kannada">kannada<br/>
country:<select name="country">
<option value="India">India</option>
<option value="USA">USA</option>
<option value="UK">UK</option>
<option value="italy">Italy</option>
</select>
<input type="submit" value="submit">
</form>
</body>
</html>