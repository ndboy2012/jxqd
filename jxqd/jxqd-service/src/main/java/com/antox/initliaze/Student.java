package com.antox.initliaze;

import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ceshi InitializingBean");
	}

}
