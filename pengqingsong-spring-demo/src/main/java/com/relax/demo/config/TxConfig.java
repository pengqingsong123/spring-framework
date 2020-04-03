package com.relax.demo.config;

import com.relax.demo.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TxConfig {

	@Bean
	public Person person(){
		return new Person("aaa",12);
	}
}
