package com.guochenglong.bean;

import java.io.Serializable;

public class Typel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int bid;
	private String bname;
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	@Override
	public String toString() {
		return "Typel [bid=" + bid + ", bname=" + bname + "]";
	}
	public Typel(int bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}
	public Typel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
