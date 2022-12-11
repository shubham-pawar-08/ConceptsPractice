package com.ok;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Fyi implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy method");
	}


	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("INIT method");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Service method");
	}


	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		System.out.println("Get servlet config");
		return null;
	}


	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub	
		System.out.println("Get servlet Info");
		return null;
	}

}
