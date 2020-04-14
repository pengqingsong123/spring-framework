package com.relax.no_xml.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;


//import javax.annotation.PreDestroy;


@Data
public class Person {
	@Value("aaaaa")
	private String name;
	@Value("111")
	private int age;

	public Person(String name, int age) {
		System.out.println("调用person 的构造函数");
		this.name = name;
		this.age = age;
	}

//	@PostConstruct
	public void init(){
		System.out.println("调用person的init.....");
	}

//	@PreDestroy
	public void destroy(){
		System.out.println("调用person的 destroy.....");
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
