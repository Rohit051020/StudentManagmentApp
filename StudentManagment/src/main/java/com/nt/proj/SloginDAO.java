package com.nt.proj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SloginDAO {
	Connection con;
	StudentBean sb;
	
	public StudentBean fatchData(String rno) throws SQLException {
		
		con=DBConnection.getConnection();
		PreparedStatement ps1=con.prepareStatement("select * from student06 where rollno=?");
		PreparedStatement ps2=con.prepareStatement("select * from studentmarks where rollNo=?");
		
		ps1.setString(1, rno);
		ps2.setString(1, rno);
		ResultSet rs1=ps1.executeQuery();
		ResultSet rs2=ps2.executeQuery();
		if(rs1.next() && rs2.next()) {
			sb=new StudentBean();
			sb.setRollNo(rs1.getString(1));
			sb.setName(rs1.getString(2));
			sb.setCourse(rs1.getString(3));
			sb.setEmail(rs1.getString(4));
			sb.getMk().setRollNo(rs2.getString(1));
			sb.getMk().setCjava(rs2.getInt(2));
			sb.getMk().setAjava(rs2.getInt(3));
			sb.getMk().setDb(rs2.getInt(4));
			sb.getMk().setUi(rs2.getInt(5));
			sb.getMk().setTotmarks(rs2.getInt(6));
			sb.getMk().setPercent(rs2.getFloat(7));
			sb.getMk().setGrade(rs2.getString(8));
		}
		
		return sb;
		
		
	}

}
