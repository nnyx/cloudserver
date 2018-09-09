package com.practice.mypro.business.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.practice.mypro.business.base.Request;
import com.practice.mypro.business.base.Response;
import com.practice.mypro.business.base.SuccessResponse;
import com.practice.mypro.business.service.LoginService;
@RestController
public class LoginController {
	private LoginService loginServiceImpl;
	@RequestMapping("getLoginToken")
	public Response<Map<String,String>> login(Request<Map<String,String>> request) {
		Map<String,String> resultMap = new HashMap<String,String>();
		resultMap.put("accessToken", loginServiceImpl.getLogingToken(request));
		return new SuccessResponse<>(resultMap);
	}
}
