package com.guochenglong.bean;

import java.io.Serializable;

public class Shoop implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String size;
	private String plice;
	private int num;
	private int cid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getPlice() {
		return plice;
	}
	public void setPlice(String plice) {
		this.plice = plice;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Shoop [id=" + id + ", name=" + name + ", size=" + size + ", plice=" + plice + ", num=" + num + ", cid="
				+ cid + "]";
	}
	public Shoop(int id, String name, String size, String plice, int num, int cid) {
		super();
		this.id = id;
		this.name = name;
		this.size = size;
		this.plice = plice;
		this.num = num;
		this.cid = cid;
	}
	public Shoop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	
	
}
