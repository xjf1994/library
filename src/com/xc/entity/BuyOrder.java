package com.xc.entity;

import java.sql.Timestamp;

/**
 * 购书订单
 * @author telecom
 *
 */
public class BuyOrder {
	
	private int boid;
	private String buyOrderId;
	private User user;
	private Book book;
	private Timestamp create_time;
	private String state;
	public int getBoid() {
		return boid;
	}
	public void setBoid(int boid) {
		this.boid = boid;
	}
	public String getBuyOrderId() {
		return buyOrderId;
	}
	public void setBuyOrderId(String buyOrderId) {
		this.buyOrderId = buyOrderId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "BuyOrder [boid=" + boid + ", buyOrderId=" + buyOrderId
				+ ", user=" + user + ", book=" + book + ", create_time="
				+ create_time + ", state=" + state + "]";
	}
}
