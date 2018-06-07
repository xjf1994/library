package com.xc.entity;

import java.sql.Timestamp;

/**
 * 书信息
 * @author telecom
 *
 */
public class Book {
	
	private int bid;
	private String bname;
	private String author;
	private String desc;
	private String isbn;
	private String suit_age;
	private String suit_sex;
	private String suit_hobby;
	private String cover;
	private Timestamp put_time;
	private String isOut;
	private String disc;
	private Double price;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getSuit_age() {
		return suit_age;
	}
	public void setSuit_age(String suit_age) {
		this.suit_age = suit_age;
	}
	public String getSuit_sex() {
		return suit_sex;
	}
	public void setSuit_sex(String suit_sex) {
		this.suit_sex = suit_sex;
	}
	public String getSuit_hobby() {
		return suit_hobby;
	}
	public void setSuit_hobby(String suit_hobby) {
		this.suit_hobby = suit_hobby;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public Timestamp getPut_time() {
		return put_time;
	}
	public void setPut_time(Timestamp put_time) {
		this.put_time = put_time;
	}
	public String getIsOut() {
		return isOut;
	}
	public void setIsOut(String isOut) {
		this.isOut = isOut;
	}
	public String getDisc() {
		return disc;
	}
	public void setDisc(String disc) {
		this.disc = disc;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", author=" + author
				+ ", desc=" + desc + ", isbn=" + isbn + ", suit_age="
				+ suit_age + ", suit_sex=" + suit_sex + ", suit_hobby="
				+ suit_hobby + ", cover=" + cover + ", put_time=" + put_time
				+ ", isOut=" + isOut + ", disc=" + disc + ", price=" + price
				+ "]";
	}
}
