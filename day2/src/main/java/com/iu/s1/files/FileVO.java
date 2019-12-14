package com.iu.s1.files;

public class FileVO {

	private int fnum; 	// PK
	private int num;	// 글번호
	private String fname; // HDD에 저장된 이름
	private String oname; // Original Name
	
	public int getFnum() {
		return fnum;
	}
	public void setFnum(int fnum) {
		this.fnum = fnum;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
}
