package com.nt.proj;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateMarksDAO {
	int k=0;
	Connection con=null;
	public int updateMarks(StudentBean sb) {
	    System.out.println(sb);
	    try {
	        con = DBConnection.getConnection();
	        System.out.println("UpdateMarksDAO.updateMarks()");
	        System.out.println(con);

	        PreparedStatement ps = con.prepareStatement("UPDATE studentmarks SET cjava=?, ajava=?, db=?, ui=?, total=?, percent=?, grade=? WHERE rollno=?");
	        ps.setInt(1, sb.getMk().getCjava());
	        ps.setInt(2, sb.getMk().getAjava());
	        ps.setInt(3, sb.getMk().getDb());
	        ps.setInt(4, sb.getMk().getUi());
	        ps.setInt(5, sb.getMk().getTotmarks());
	        ps.setFloat(6, sb.getMk().getPercent());
	        ps.setString(7, sb.getMk().getGrade());
	        ps.setString(8, sb.getMk().getRollNo()); // Corrected the roll number parameter

	        System.out.println("The rollNo: " + sb.getRollNo());
	        System.out.println(sb.getMk().getAjava());
	        System.out.println(sb.getMk().getCjava());
	        System.out.println(sb.getMk().getDb());
	        System.out.println(sb.getMk().getGrade());
	        System.out.println(sb.getMk().getPercent());
	        System.out.println(sb.getMk().getTotmarks());
	        System.out.println(sb.getMk().getUi());

	         k = ps.executeUpdate(); // Changed to executeUpdate()
	        System.out.println("The value of "+k);
	        
	        if (k > 0) {
	            System.out.println("Updated successfully");
	        } else {
	            System.out.println("No records updated");
	        }	
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return k;
	}


}
