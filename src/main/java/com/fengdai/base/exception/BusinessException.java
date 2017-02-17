package com.fengdai.base.exception;

public class BusinessException  extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6241946854991402787L;

	private ErrorCode errorCode;
	private int code;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public BusinessException(){
		 super();
	}
	
	public ErrorCode getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}
	
	public BusinessException(ErrorCode errorCode){
		super(errorCode.getDescription());
		this.code=errorCode.getCode();
		this.errorCode=errorCode;
	}
}
