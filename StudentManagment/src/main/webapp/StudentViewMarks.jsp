<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.nt.proj.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	StudentBean sb = (StudentBean) request.getAttribute("Sdetails");
	out.print("RollNo: " + sb.getRollNo());
	out.print("Name: " + sb.getName());
	%>

</body>
</html>