package com.nt.proj;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/slogout1")
public class StudentLogoutServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
     HttpSession hs=req.getSession(false);
     if(hs==null) {
    	 req.setAttribute("msg", "Session Expired........");
    	 req.getRequestDispatcher("msg.jsp").forward(req, res);
     }
     else {
    	 req.getRequestDispatcher("StudentLogout.jsp").forward(req, res);
     }
	}

}
