package com.relax.no_xml.service;

import com.relax.no_xml.dao.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author
 */
@Service
public class HelloServiceImpl implements HelloService {

	public HelloServiceImpl() {
		System.out.println("HelloServiceImpl 构造方法.....");
	}

	@Autowired
	private HelloDao helloDao;
	@Override
	public void hello() {
		System.out.println("hello service 执行hello()方法.....");
		final String s = helloDao.saveHello();
	}

	@Override
	public int mathException(int i, int j) {
		System.out.println("hello service 执行mathException()方法.....");
		return i/j;
	}
}
