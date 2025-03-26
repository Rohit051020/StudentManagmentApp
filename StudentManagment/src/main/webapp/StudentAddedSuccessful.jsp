<%@page import="com.nt.proj.StudentBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
  StudentBean sb=(StudentBean)session.getAttribute("sbean");
  out.println("Student "+sb.getName()+" Added Successful"+"<br>");
%>
<br>
 <a href="AddStudent.html">AddStudent</a><br>
<a href="view">ViewAllStudent</a><br>
<a href="logout">Logout</a>
</body>
</html>