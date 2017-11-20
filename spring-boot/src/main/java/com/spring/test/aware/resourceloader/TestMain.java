package com.spring.test.aware.resourceloader;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
		ResourceLoaderTest bean = context.getBean(ResourceLoaderTest.class);
		bean.out();
	}

}