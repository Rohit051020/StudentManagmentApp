package com.nt.proj;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.nt.proj.DBConnection;
import com.nt.proj.StudentBean;

public class ViewAllStudentDAO {
	
	Connection con;
	ArrayList<StudentBean> al=new ArrayList<StudentBean>();
	
	public ArrayList<StudentBean> viewAllStudent() {
	try {
		con=DBConnection.getConnection();
		System.out.println("Conn:::  "+con);
		PreparedStatement ps=con.prepareStatement("select * from student06");
		PreparedStatement ps2=con.prepareStatement("select * from studentmarks");
		ResultSet rs=ps.executeQuery();
		ResultSet rs2=ps2.executeQuery();
		while(rs.next() && rs2.next()) {
			 StudentBean sb=new StudentBean();
			sb.setRollNo(rs.getString(1));
			sb.setName(rs.getString(2));
			sb.setCourse(rs.getString(3));
			sb.setEmail(rs.getString(4));
			sb.getMk().setRollNo(rs.getString(1));
			sb.getMk().setCjava(rs2.getInt(2));
			sb.getMk().setAjava(rs2.getInt(3));
			sb.getMk().setDb(rs2.getInt(4));
			sb.getMk().setUi(rs2.getInt(5));
			sb.getMk().setTotmarks(rs2.getInt(6));
			sb.getMk().setPercent(rs2.getFloat(7));
			sb.getMk().setGrade(rs2.getString(8));
			al.add(sb);
			
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return al;
	}

}
