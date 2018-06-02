package com.telecom.common;

/**
 * 定义返回结果�?

 */
public class Result {
	/**
	 * 返回信息
	 */
	private String message;
	/**
	 * 是否成功
	 */
	private boolean success;
	/**
	 * 返回结果
	 */
	private Object result;

	public Result() {
	};

	public Result(String message, boolean success) {
		this.message = message;
		this.success = success;
	}

	public Result(String message, boolean success, Object result) {
		this.message = message;
		this.success = success;
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

}
