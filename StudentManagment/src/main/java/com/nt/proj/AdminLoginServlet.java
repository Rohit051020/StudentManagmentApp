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
@WebServlet("/admin")
public class AdminLoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		String uN=req.getParameter("un");
		String pW=req.getParameter("pw");
		System.out.println(uN);
		System.out.println(pW);
		AdminBean ab=new AdminLoginDAO().login(uN, pW);			
			if(ab==null) {
				req.setAttribute("msg","Invalid UserName or Password.........");
			 req.getRequestDispatcher("msg.jsp").forward(req,res);
				
			}
			else {
				HttpSession hs=req.getSession();
				hs.setAttribute("abean",ab);
				req.getRequestDispatcher("AdminLoginSuccess.jsp").forward(req, res);;
			}
		
		
	}

}
