package cn.tamny.models;

import java.sql.Date;

public class Member {

	private int id;
	private String name;
	private Date date;
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
	public Date getData() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
