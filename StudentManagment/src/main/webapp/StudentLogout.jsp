<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="com.nt.proj.StudentBean"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
  session.removeAttribute("sbean");
  session.invalidate();
  out.println("Student Logout Successfully..........");

%>
<a href="StudentLogin.html">Studentlogin</a>

</body>
</html>