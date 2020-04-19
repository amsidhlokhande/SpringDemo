package com.amsidh.mvc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amsidh.mvc.dto.Triangle;


public class MainApp2 {

	public static void main(String[] args) {
		// Triangle triangle=new Triangle();
			
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-beans.xml");
		Triangle triangle = (Triangle) context.getBean("t1");
		context.getBean("t1");
		context.getBean("t1");
		
		triangle.draw();

	}

}
