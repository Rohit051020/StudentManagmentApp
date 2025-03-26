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
@WebServlet("/edit")
public class EditServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException {
		HttpSession hs=req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg","Session Expired........");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}
		else {
			String rno=req.getParameter("rollno");
			ArrayList<AdminBean> al=(ArrayList<AdminBean>)hs.getAttribute("alist");
			Iterator itr=al.iterator();
			while(itr.hasNext()) {
				StudentBean sb=(StudentBean)itr.next();
				if(sb.getRollNo().equals(rno)) {
					req.setAttribute("sbean", sb);
					req.getRequestDispatcher("Edit.jsp").forward(req, res);
					break;
				}//end of if condition
			}//end of while loop
		} //end of else condition
	}//end of main method

}
