package com.practice.mypro.business.service;

import java.util.Map;

import com.practice.mypro.business.base.Request;

public interface LoginService {
	public String getLogingToken(Request<Map<String,String>> request);
}
