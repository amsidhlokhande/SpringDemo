package com.amsidh.mvc.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.amsidh.mvc.dto.Triangle;

@SuppressWarnings("deprecation")
public class MainApp {

	public static void main(String[] args) {
		// Triangle triangle=new Triangle();
			
		@SuppressWarnings("deprecation")
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring-beans.xml"));
		Triangle triangle = (Triangle) beanFactory.getBean("t1");
		 beanFactory.getBean("t1");
		 beanFactory.getBean("t1");
		triangle.draw();

	}

}
