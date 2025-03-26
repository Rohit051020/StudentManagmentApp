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

@WebServlet("/update")
public class UpdatemarksServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		HttpSession hs=req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg","Session Expired..........");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}
		else {
			ArrayList<StudentBean>al=(ArrayList<StudentBean>)hs.getAttribute("alist");
			String rollNo=req.getParameter("rollno");
			Iterator<StudentBean> itr=al.iterator();
			while(itr.hasNext()) {
				StudentBean sb=itr.next();
				if(sb.getRollNo().equals(rollNo)) {

					int cjava=Integer.parseInt(req.getParameter("cjava"));
					int ajava=Integer.parseInt(req.getParameter("ajava"));
					int db=Integer.parseInt(req.getParameter("db"));
					int ui=Integer.parseInt(req.getParameter("ui"));
					int totmark=cjava+ajava+db+ui;
					float per=(totmark)/4;
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
					sb.getMk().setCjava(cjava);
					sb.getMk().setAjava(ajava);
					sb.getMk().setDb(db);
					sb.getMk().setUi(ui);
					sb.getMk().setTotmarks(totmark);
					sb.getMk().setPercent(per);
					sb.getMk().setGrade(grade);
					int p=new UpdateMarksDAO().updateMarks(sb);
					System.out.println("The value of p in servlet"+p);
					if(p>0) {
						req.setAttribute("sbean", sb);
						req.getRequestDispatcher("UpdateMarks.jsp").forward(req, res);
					}
					else {
						req.setAttribute("msg","Not Updated..........");
						req.getRequestDispatcher("msg.jsp").forward(req, res);
					}
					
					
				}
			}
		}
		
	}

}
