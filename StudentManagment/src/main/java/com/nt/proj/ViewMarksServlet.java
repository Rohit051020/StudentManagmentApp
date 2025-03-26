package com.nt.proj;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/viewm")
public class ViewMarksServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		HttpSession hs=req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Session Expired...........");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}
		else {
			ArrayList<StudentBean>alis=(ArrayList<StudentBean>)hs.getAttribute("alist");
			String rno=req.getParameter("rollno");
			System.out.println("The rollNo is: "+rno);
			Iterator<StudentBean>itr=alis.iterator();
			while(itr.hasNext()) {
				StudentBean sb=(StudentBean)itr.next();
				String rollNo=sb.getRollNo();
				System.out.println("Inside while loop");
	
				if(rno.equals(rollNo)) {
					req.setAttribute("sbean", sb);
					System.out.println("Inside If Loop");
					req.getRequestDispatcher("ViewMarks.jsp").forward(req, res);
					break;
				}// end of if condition
			}// end of while loop
		} //end od else
	}

}
