package com.nt.proj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminLoginDAO {
	public  AdminBean ab=null;
	public AdminBean login(String uname,String password){
		try {
		Connection con=DBConnection.getConnection();
		System.out.println(con);
		PreparedStatement ps=con.prepareStatement("select * from admin06 where uname=? and pword=?");
		ps.setString(1,uname);
		ps.setString(2, password);
		System.out.println(uname);
		System.out.println(password);
		
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			ab=new AdminBean();
			ab.setUsername(rs.getString(1));
			ab.setPassword(rs.getString(2));
			ab.setFname(rs.getString(3));
			ab.setLname(rs.getString(4));
			
			
			
			ab.setEmail(rs.getString(6));
			ab.setPhn(rs.getLong(7));
			System.out.println(ab);
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return ab;
	}

}
