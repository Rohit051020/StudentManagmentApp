package com.nt.proj;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AdminBean implements Serializable{
  private String username,password,fname,lname,email;
  private long phn;
public AdminBean() {
	super();
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhn() {
	return phn;
}
public void setPhn(long phn) {
	this.phn = phn;
}
  

}
