package com.practice.mypro.business.base;
/**
 * 
 * @author yzh
 *
 * @param <T>
 */
public class Response<T> {
	private Integer resultCode;
	private T body;
	public Response(Integer resultCode,T body) {
		this.resultCode = resultCode;
		this.body = body;
	}
	public Integer getResultCode() {
		return resultCode;
	}

	public void setResultCode(Integer resultCode) {
		this.resultCode = resultCode;
	}

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}
	
}
