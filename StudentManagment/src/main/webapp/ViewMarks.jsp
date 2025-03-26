<%@ page import="com.nt.proj.*" %>
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
   AdminBean ab=(AdminBean)session.getAttribute("abean");
   StudentBean sb=(StudentBean)request.getAttribute("sbean");
   out.print("This page Belongs to Admin: "+ab.getFname()+"<br>");
   out.print("RollNo: "+sb.getRollNo()+"<br>");
   out.print("CoreJava: "+sb.getMk().getCjava()+"<br>");
   out.print("AdvJava: "+sb.getMk().getAjava()+"<br>");
   out.print("DB: "+sb.getMk().getDb()+"<br>");
   out.print("UI: "+sb.getMk().getUi()+"<br>");
%>
<a href="edit?rollno=<%=sb.getRollNo()%>">EditMarks</a>
<a href="AddStudent.html">AddStudent</a>
<a href="view">ViewAllStudent</a>
<a href="logout">Logout</a>

</body>
</html>