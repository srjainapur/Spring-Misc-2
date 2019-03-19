package com.java.bean.post.process;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld implements BeanPostProcessor {
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeforeInitialization : " + beanName);
		((HelloWorld)bean).setMessage("Setting message in Before Initialization");
		return bean; // you can return any other object as well
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("AfterInitialization : " + beanName);
		((HelloWorld)bean).setMessage("Setting message in After Initialization");
		return bean; // you can return any other object as well
	}
}
