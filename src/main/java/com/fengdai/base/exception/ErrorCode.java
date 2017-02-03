package com.fengdai.base.exception;

public enum ErrorCode {
	
	ERROR_NOT_NULL_ERROR(0001, "不能为空");
	
    private Integer code;
    private String description;
     
    ErrorCode(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
