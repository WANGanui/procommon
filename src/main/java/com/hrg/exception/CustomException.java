package com.hrg.exception;


public class CustomException extends Exception {
	private static final long serialVersionUID = 1L;

	public CustomException(String errorCode, String messgae) {
		super(messgae);
		this.errorCode = errorCode;
	}

	private String errorCode;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	
}
