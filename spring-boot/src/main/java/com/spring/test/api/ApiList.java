package com.spring.test.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.test.pojo.Book;

@RestController
public class ApiList {
	@RequestMapping("/index")
	public void index() {
		Book book = new Book();
//		System.out.println(book.getName() + ":" + book.get);
		
	}
}
