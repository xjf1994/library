package com.xc.entity;

public class User {
	
	private int uid;
	private String username;
	private String pass;
	private Combo combo;
	private int libm;
	private Info info;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Combo getCombo() {
		return combo;
	}
	public void setCombo(Combo combo) {
		this.combo = combo;
	}
	public int getLibm() {
		return libm;
	}
	public void setLibm(int libm) {
		this.libm = libm;
	}
	public Info getInfo() {
		return info;
	}
	public void setInfo(Info info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", pass=" + pass
				+ ", combo=" + combo + ", libm=" + libm + ", info=" + info
				+ "]";
	}
}
