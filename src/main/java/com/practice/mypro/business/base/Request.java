package com.practice.mypro.business.base;
/**
 * 
 * @author yzh
 *
 * @param <T>
 */
public class Request<T> {
	private T body;

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}
	
}
