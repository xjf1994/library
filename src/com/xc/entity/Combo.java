package com.xc.entity;

/**
 * 套餐类
 * @author telecom
 *
 */
public class Combo {
	
	private int cid;
	private String combo_name;
	private String combo_desc;
	private double combo_price;
	private String combo_content;
	public int getCid() {
		return cid;
	}
	public String getCombo_name() {
		return combo_name;
	}
	public void setCombo_name(String combo_name) {
		this.combo_name = combo_name;
	}
	public String getCombo_desc() {
		return combo_desc;
	}
	public void setCombo_desc(String combo_desc) {
		this.combo_desc = combo_desc;
	}
	public double getCombo_price() {
		return combo_price;
	}
	public void setCombo_price(double combo_price) {
		this.combo_price = combo_price;
	}
	public String getCombo_content() {
		return combo_content;
	}
	public void setCombo_content(String combo_content) {
		this.combo_content = combo_content;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Combo [cid=" + cid + ", combo_name=" + combo_name
				+ ", combo_desc=" + combo_desc + ", combo_price=" + combo_price
				+ ", combo_content=" + combo_content + "]";
	}
}
