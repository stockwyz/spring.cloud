package com.spring.test.aware.beaname;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AwareConfig.class);
		BeanNameAwareTest bean = ac.getBean(BeanNameAwareTest.class);
		bean.outName();
	}
}
