package com.xc.entity;

import java.sql.Timestamp;

/**
 * 借书订单
 * @author telecom
 *
 */
public class BorrowOrder {

	private int brid;
	private String brOrderId;
	/**
	 * 押金
	 */
	private Double deposit;
	private Timestamp out_time;
	private Timestamp return_time;
	private String isBuy;
	private String isReturn;
	private String state;
	public int getBrid() {
		return brid;
	}
	public void setBrid(int brid) {
		this.brid = brid;
	}
	public String getBrOrderId() {
		return brOrderId;
	}
	public void setBrOrderId(String brOrderId) {
		this.brOrderId = brOrderId;
	}
	public Double getDeposit() {
		return deposit;
	}
	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}
	public Timestamp getOut_time() {
		return out_time;
	}
	public void setOut_time(Timestamp out_time) {
		this.out_time = out_time;
	}
	public Timestamp getReturn_time() {
		return return_time;
	}
	public void setReturn_time(Timestamp return_time) {
		this.return_time = return_time;
	}
	public String getIsBuy() {
		return isBuy;
	}
	public void setIsBuy(String isBuy) {
		this.isBuy = isBuy;
	}
	public String getIsReturn() {
		return isReturn;
	}
	public void setIsReturn(String isReturn) {
		this.isReturn = isReturn;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "BorrowOrder [brid=" + brid + ", brOrderId=" + brOrderId
				+ ", deposit=" + deposit + ", out_time=" + out_time
				+ ", return_time=" + return_time + ", isBuy=" + isBuy
				+ ", isReturn=" + isReturn + ", state=" + state + "]";
	}
}
