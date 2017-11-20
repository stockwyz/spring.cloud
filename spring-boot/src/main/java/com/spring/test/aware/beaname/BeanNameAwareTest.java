package com.spring.test.aware.beaname;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;

@Service
public class BeanNameAwareTest implements BeanNameAware {
	private String beanName;

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}

	public void outName() {
		System.out.println(beanName);
	}
}
