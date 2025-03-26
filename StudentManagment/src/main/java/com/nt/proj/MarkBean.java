package com.nt.proj;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MarkBean implements Serializable{
	private String rollNo;
	private int cjava,ajava,db,ui,totmarks;
	private float percent;
	private String grade;
	public MarkBean() {
		super();
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public int getCjava() {
		return cjava;
	}
	public void setCjava(int cjava) {
		this.cjava = cjava;
	}
	public int getAjava() {
		return ajava;
	}
	public void setAjava(int ajava) {
		this.ajava = ajava;
	}
	public int getDb() {
		return db;
	}
	public void setDb(int db) {
		this.db = db;
	}
	public int getUi() {
		return ui;
	}
	public void setUi(int ui) {
		this.ui = ui;
	}
	public int getTotmarks() {
		return totmarks;
	}
	public void setTotmarks(int totmarks) {
		this.totmarks = totmarks;
	}
	public float getPercent() {
		return percent;
	}
	public void setPercent(float percent) {
		this.percent = percent;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "MarkBean [rollNo=" + rollNo + ", cjava=" + cjava + ", ajava=" + ajava + ", db=" + db + ", ui=" + ui
				+ ", totmarks=" + totmarks + ", percent=" + percent + ", grade=" + grade + "]";
	}
	
	

}
