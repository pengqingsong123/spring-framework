package com.relax.no_xml.demo;

import com.relax.no_xml.bean.Person;
import com.relax.no_xml.config.PqsConfig;
import com.relax.no_xml.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo {
	public static void main(String[] args) {
		final ApplicationContext application = new AnnotationConfigApplicationContext(PqsConfig.class);
		System.out.println("======================");
		final Person person = application.getBean(Person.class);
		System.out.println(person);

		System.out.println("===========helloService.hello()方法===========");
		final HelloService helloService = (HelloService) application.getBean("helloServiceImpl");
		helloService.hello();


		System.out.println("===========helloService.mathException()方法===========");
		int result = helloService.mathException(2, 0);


	}
}
