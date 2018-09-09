package com.practice.mypro.business.service.impl;

import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.practice.mypro.business.base.Request;
import com.practice.mypro.business.service.LoginService;
import com.practice.mypro.https.HTTPSClientUtil;
import com.practice.mypro.response.CertificateResponse;

@Service
public class LoginServiceImpl implements LoginService {

	@Override
	public String getLogingToken(Request<Map<String, String>> request) {
		CertificateResponse response = null;
		String responseStr = HTTPSClientUtil.doGet("", request.getBody());
		if(!org.springframework.util.StringUtils.isEmpty(responseStr)&&
				!responseStr.contains("error")) {
			response = JSONObject.toJavaObject((JSON)JSON.parse(responseStr), CertificateResponse.class);
		}
		response.getOpenid();
		response.getSession_key();
		String accessToken = UUID.randomUUID().toString();
		return accessToken;
	}

}
