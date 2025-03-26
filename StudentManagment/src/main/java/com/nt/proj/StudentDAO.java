package com.nt.proj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.http.HttpSession;

public class StudentDAO {
	public int insert(StudentBean sb) {
		int k=0;
		try {
			Class.forName(DBInfo.driver);
			Connection con=DriverManager.getConnection(DBInfo.DbURL,DBInfo.DbUser,DBInfo.DbPass);
			
			PreparedStatement ps=con.prepareStatement("insert into student06 values(?,?,?,?)");
			PreparedStatement ps1=con.prepareStatement("insert into studentmarks values(?,?,?,?,?,?,?,?)");
			ps.setString(1, sb.getRollNo());
			ps.setString(2, sb.getName());
			ps.setString(3, sb.getCourse());
			ps.setString(4, sb.getEmail());
			int p=ps.executeUpdate();
			if(p>0) {
				ps1.setString(1, sb.getMk().getRollNo());
				ps1.setInt(2, sb.getMk().getCjava());
				ps1.setInt(3, sb.getMk().getAjava());
				ps1.setInt(4, sb.getMk().getDb());
				ps1.setInt(5, sb.getMk().getUi());
				ps1.setInt(6,sb.getMk().getTotmarks());
				ps1.setFloat(7, sb.getMk().getPercent());
				ps1.setString(8, sb.getMk().getGrade());	
				k=ps1.executeUpdate();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}

}
