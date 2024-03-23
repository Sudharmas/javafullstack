<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Getter method</title>
</head>
<body>
<!-- the id and the name inside jsp setproperty and getproperty should be same .if it is changed or different then the file would not work or throw an error in webpage . To set values to variables in get.jsp file,the name and id should be same in both files.here name and id is "Beans" -->
<jsp:useBean id="Beans" class="beans.javabeans"  scope="session"></jsp:useBean>
<!-- type jsp: and press ctrl+spcebar then the list of jsp properties will be displayed,then click on any one which is to be used,here useBean is used to imply setter and getter properties in webpage.give a  classname as the path of file inside project that is here Beans is project and javabeans is the file,give a name which should be given to the name of jsp properties that will be used -->
fname:<jsp:getProperty property="fname" name="Beans" /><br/>
<!-- getproperty gets the data from setproperty and simply displays it in the webpage -->
<!-- getProperty used to get values of variables. property is the name of variable to which the value to be get,and the value is the value for the varaible which is defined in property ,here property="fname" ,that is the value should be set for variable fname which is in get.jsp file-->
 lname: <jsp:getProperty property="l_name" name="Beans" />
</body>
</html>