package com.relax.no_xml.config;

import com.relax.no_xml.aop.LogAspects;
import com.relax.no_xml.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.relax")
@EnableAspectJAutoProxy
public class PqsConfig {

	@Bean
	public Person person(){
		return new Person("zhangsan",12);
	}

	@Bean
	public LogAspects logAspects(){
		return new LogAspects();
	}
}
