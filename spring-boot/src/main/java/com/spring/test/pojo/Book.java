package com.spring.test.pojo;

import org.springframework.beans.factory.annotation.Value;

public class Book {
	@Value("${book.name}")
	private String name;
	
	@Value("${book.years}")
	private Integer years;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
