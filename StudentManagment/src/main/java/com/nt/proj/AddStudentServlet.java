package com.nt.proj;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings({ "unused", "serial" })
@WebServlet("/student")
public class AddStudentServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		StudentBean sb=new StudentBean();
		sb.setRollNo(req.getParameter("rollno"));
		sb.setName(req.getParameter("name"));
		sb.setCourse(req.getParameter("course"));
		sb.setEmail(req.getParameter("email"));
		
		int cj=Integer.parseInt(req.getParameter("cjava"));
		int aj=Integer.parseInt(req.getParameter("ajava"));
		int db=Integer.parseInt(req.getParameter("db"));
		int ui=Integer.parseInt(req.getParameter("ui"));
		int totalMark=cj+aj+db+ui;
		float per=(totalMark)/4;
		String grade=null;
		if(per>90 && per<=100) {
			grade="A";
		}
		else if(per>80 && per<=90) {
			grade="B";
		}
		else if(per>60 && per<=80) {
			grade="C";
		}
		else if(per>33 && per<=60) {
			grade="D";
		}
		else {
			grade="F";
		}
		sb.getMk().setRollNo(req.getParameter("rollno"));
		sb.getMk().setCjava(cj);
		sb.getMk().setAjava(aj);
		sb.getMk().setDb(db);
		sb.getMk().setUi(ui);
		sb.getMk().setTotmarks(totalMark);
		sb.getMk().setPercent(per);
		sb.getMk().setGrade(grade);
		int k=new StudentDAO().insert(sb);
		if(k==0) {
			req.setAttribute("msg","Already this roll is assign to other Student" );
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}
		else{
			HttpSession hs=req.getSession(false);
			hs.setAttribute("sbean",sb);
			req.getRequestDispatcher("StudentAddedSuccessful.jsp").forward(req, res);
		
		}
		
	}

}
