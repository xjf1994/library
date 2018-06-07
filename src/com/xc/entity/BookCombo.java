package com.xc.entity;

import java.sql.Timestamp;

/**
 * 书适合的套餐
 * @author telecom
 *
 */
public class BookCombo {
	
	private int bcid;
	private Book book;
	private Combo combo;
	private User user;
	private Timestamp handle_time;
	public int getBcid() {
		return bcid;
	}
	public void setBcid(int bcid) {
		this.bcid = bcid;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Combo getCombo() {
		return combo;
	}
	public void setCombo(Combo combo) {
		this.combo = combo;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Timestamp getHandle_time() {
		return handle_time;
	}
	public void setHandle_time(Timestamp handle_time) {
		this.handle_time = handle_time;
	}
	@Override
	public String toString() {
		return "BookCombo [bcid=" + bcid + ", book=" + book + ", combo="
				+ combo + ", user=" + user + ", handle_time=" + handle_time
				+ "]";
	}
}
