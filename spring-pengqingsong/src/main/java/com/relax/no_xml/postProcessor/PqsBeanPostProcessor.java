package com.relax.no_xml.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PqsBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("bean的后置处理器---BeforeInitialization,beanName=>"+beanName+",bean ="+bean);
		if(beanName.equals("person")){
			System.out.println("移除person");
			return null;
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("bean的后置处理器---AfterInitialization,beanName=>"+beanName+",bean ="+bean);
		return bean;
	}
}
