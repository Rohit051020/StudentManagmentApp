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
  session.removeAttribute("abean");
  session.removeAttribute("sbean");
  session.invalidate();
  out.print("Admin Logout Successully........");
%>
<%@ include file="Home.html"%>

</body>
</html>