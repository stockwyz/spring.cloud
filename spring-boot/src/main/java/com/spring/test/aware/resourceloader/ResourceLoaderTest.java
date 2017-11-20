package com.spring.test.aware.resourceloader;

import java.io.File;
import java.io.IOException;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class ResourceLoaderTest implements ResourceLoaderAware {
	private ResourceLoader resourceLoader;
	
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		// TODO Auto-generated method stub
		this.resourceLoader = resourceLoader;
	}
	
	public void out() {
		Resource resource = resourceLoader.getResource("classpath:com/test/dev.properties");
		File file;
		try {
			file = resource.getFile();
			System.out.println(file.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
