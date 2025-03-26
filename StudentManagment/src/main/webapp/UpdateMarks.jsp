<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="com.nt.proj.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   AdminBean ab=(AdminBean)session.getAttribute("abean");
   out.print("This page belongs to Admin: "+ab.getFname());
   out.print("Updated Successfully............");

%>
<a href="Student.html">AddStudent</a>
<a href ="logout">Logout</a>

</body>
</html>