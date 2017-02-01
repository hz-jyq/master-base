package com.fengdai.base.form;

import java.io.Serializable;

import javax.ws.rs.QueryParam;


public class AbstractPageForm  implements Serializable{

	private static final long serialVersionUID = -4496495227753715322L;
	
	
	@QueryParam("pageNum")
	private int pageNum = 0;
	
	@QueryParam("pageSize")
	private int pageSize = 10;

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
