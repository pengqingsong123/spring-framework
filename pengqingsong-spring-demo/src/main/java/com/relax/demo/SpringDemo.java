package com.relax.demo;

import com.relax.demo.bean.Person;
import com.relax.demo.config.TxConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(TxConfig.class);

		final Person person = (Person) applicationContext.getBean("person");
		System.out.println(person);
	}
}

