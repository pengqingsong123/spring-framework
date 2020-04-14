package com.relax.no_xml.service;

public interface HelloService {
	 void hello();

	/**
	 * 模拟apo的异常通知,
	 * 方法返回 i/j
	 * @param i
	 * @param j
	 * @return
	 */
	 int mathException(int i,int j);
}
