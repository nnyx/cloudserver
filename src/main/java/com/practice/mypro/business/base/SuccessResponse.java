package com.practice.mypro.business.base;

public class SuccessResponse<T> extends Response<T> {
	private static final Integer SUCCESS_CODE = 200;
	public SuccessResponse(T body) {
		super(SUCCESS_CODE, body);
	}
}
