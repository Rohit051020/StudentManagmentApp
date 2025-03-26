package com.nt.proj;
import java.io.IOException;
import java.util.ArrayList;

import com.nt.proj.StudentBean;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewAllStudentServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		ViewAllStudentDAO vs=new ViewAllStudentDAO();
		ArrayList<StudentBean> als=vs.viewAllStudent();
		System.out.println("The value of als: "+als);
		if(als==null) {
			req.setAttribute("msg","No Record Found");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}
		else {
			HttpSession hs=req.getSession();
			hs.setAttribute("alist",als);
			req.getRequestDispatcher("ViewAllStudent.jsp").forward(req, res);
		}
		
	}

}
