<%@page import="java.util.ArrayList ,java.util.*,com.nt.proj.AdminBean"%>
<%@ page import="com.nt.proj.StudentBean" %>
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
  AdminBean ad=(AdminBean)session.getAttribute("abean");
  out.print("This page Belongs to Admin: "+ad.getFname()+"<br>");
  ArrayList<StudentBean> al=(ArrayList<StudentBean>)session.getAttribute("alist");

  Iterator<StudentBean> i=al.iterator();
  while(i.hasNext()){
	  StudentBean sb=i.next();
	  out.print("RollNo: "+sb.getRollNo()+"<br>");
	  out.print("Name: "+sb.getName()+"<br>");
	  out.print("Course: "+sb.getCourse()+"<br>");
	  out.print("Email: "+sb.getEmail()+"<br>");
	   out.print("TotalMarks: "+sb.getMk().getTotmarks()+"<br>");
	   out.print("Percentage: "+sb.getMk().getPercent()+"<br>");
	   out.print("Grade: "+sb.getMk().getGrade()+"<br>");
	   
	  out.print("<a href=viewm?rollno="+sb.getRollNo()+">viewMarks</a><br>");
  }
 %>
<a href="AddStudent.html">AddStudent</a>
<a href="logout">Logout</a>
</body>
</html>