package com.relax.no_xml.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PqsLazyInitBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("beanFactory的后置处理器........");
        for (String beanName : beanFactory.getBeanDefinitionNames()) {
//            beanFactory.getBeanDefinition(beanName).setLazyInit(true);
        }

    }

}
