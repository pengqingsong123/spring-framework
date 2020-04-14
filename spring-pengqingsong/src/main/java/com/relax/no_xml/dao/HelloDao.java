package com.relax.no_xml.dao;

import org.springframework.stereotype.Repository;

@Repository
public class HelloDao {
	public String saveHello(){
		System.out.println("HelloDao......");
		return "HelloDao";
	}
}
