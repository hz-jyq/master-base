package com.fengdai.base.exception;

public class BusinessException  extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6241946854991402787L;

	private ErrorCode errorCode;

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
		this.errorCode=errorCode;
	}
}
