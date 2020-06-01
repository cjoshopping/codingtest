package com.cj.codingtest.model;

public class Json<T> {
	private Integer status = 0;
	private String errorMessage = "";
	private T result;
	
	public static <T> Json<T> createJson(T result) {
		Json<T> json = new Json<>();
		json.setResult(result);
		return json;
	}
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
}
