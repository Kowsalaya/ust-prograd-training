package com.example.CountOfBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CountOfBeanApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(CountOfBeanApplication.class, args);
		System.out.println(context.getBeanDefinitionCount());
		System.out.println(context.getBeanDefinitionCount());
	}

}
