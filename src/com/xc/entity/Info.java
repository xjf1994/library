package com.xc.entity;

import java.sql.Timestamp;

public class Info {
	
	private int iid;
	private int uid;
	private String info_name;
	private String info_sex;
	private String info_hobby;
	private int info_age;
	private Timestamp create_time;
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getInfo_name() {
		return info_name;
	}
	public void setInfo_name(String info_name) {
		this.info_name = info_name;
	}
	public String getInfo_sex() {
		return info_sex;
	}
	public void setInfo_sex(String info_sex) {
		this.info_sex = info_sex;
	}
	public String getInfo_hobby() {
		return info_hobby;
	}
	public void setInfo_hobby(String info_hobby) {
		this.info_hobby = info_hobby;
	}
	public int getInfo_age() {
		return info_age;
	}
	public void setInfo_age(int info_age) {
		this.info_age = info_age;
	}
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	@Override
	public String toString() {
		return "Info [iid=" + iid + ", uid=" + uid + ", info_name=" + info_name
				+ ", info_sex=" + info_sex + ", info_hobby=" + info_hobby
				+ ", info_age=" + info_age + ", create_time=" + create_time
				+ "]";
	}
}
