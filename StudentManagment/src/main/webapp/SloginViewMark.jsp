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
    out.print("Core Java mark: "+sb.getMk().getCjava()+"<br>");
    out.print("Adv Java mark: "+sb.getMk().getAjava()+"<br>");
    out.print("Db Java mark: "+sb.getMk().getDb()+"<br>");
    out.print("UI Java mark: "+sb.getMk().getUi()+"<br>");
    out.print("Total marks: "+sb.getMk().getTotmarks()+"<br>");
    out.print("Percentage: "+sb.getMk().getPercent()+"<br>");
    out.print("Grade: "+sb.getMk().getGrade()+"<br>");


%>
<a href="StudentDetails.jsp">ViewYourDetails</a>
<a href="slogout1">Logout</a>

</body>
</html>