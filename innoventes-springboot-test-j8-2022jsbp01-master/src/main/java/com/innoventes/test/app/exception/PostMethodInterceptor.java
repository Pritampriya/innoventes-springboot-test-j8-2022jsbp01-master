package com.innoventes.test.app.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class PostMethodInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean
	preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception
	{
		if(request.getMethod().equals("POST"))
		{
			
		}
		return false;
		
	}

}
