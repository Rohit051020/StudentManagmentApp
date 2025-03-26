package com.nt.proj;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/slogin")
public class StudentLoginServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		String rollNo=req.getParameter("rno");
		System.out.println("RollNO: "+rollNo);
		try {
		StudentBean sb=	new SloginDAO().fatchData(rollNo);
		System.out.println("sb  "+sb);
		if(sb==null) {
			req.setAttribute("msg","Invalid RollNo........");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}
		else {
			HttpSession hs=req.getSession();
			hs.setAttribute("sbean",sb);
			req.getRequestDispatcher("StudentLogin.jsp").forward(req, res);
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
