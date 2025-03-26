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
   StudentBean sb=(StudentBean)request.getAttribute("sbean");
   out.print("This page belong to Admin: "+ab.getFname()+"<br>");
   
%>
<form action="update" method="post">
<input type="hidden" name="rollno"value=<%=sb.getRollNo() %>>
CoreJava:<input type="text" name="cjava" value=<%=sb.getMk().getCjava()%>><br>
AdvJava:<input type="text"name="ajava"value=<%=sb.getMk().getAjava()%>><br>
DB:<input type="text"name="db"value=<%=sb.getMk().getDb() %>><br>
UI:<input type="text"name="ui"value=<%=sb.getMk().getUi()%>><br>
<input type="submit"value="updateMarks">
</form>
<a href="view">ViewAllStudent</a>
<a href="logout">Logout</a>

</body>
</html>