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
   StudentBean sb=(StudentBean)session.getAttribute("sbean");
   out.print("your Details: "+"<br>");
   out.print("RollNo: "+sb.getRollNo()+"<br>");
   out.println("Name: "+sb.getName()+"<br>");
   out.println("Course: "+sb.getCourse()+"<br>");
   out.println("Email: "+sb.getEmail()+"<br>");
//   out.println("<a href=viewmark?rollno="+sb.getRollNo()+">ViewMarks</a>");
   out.println("<a href=SloginViewMark.jsp>Viewmarks</a>");
   
%>
<a href="slogout1">Logout</a>

</body>
</html>