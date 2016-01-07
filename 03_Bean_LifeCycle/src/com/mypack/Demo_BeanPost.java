package com.mypack;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Demo_BeanPost implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object obj, String beanName)
			throws BeansException {
		System.out.println("after initialization"+beanName);
		return obj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object obj, String beanName)
			throws BeansException {
		System.out.println("Before initialization"+ beanName );
		return obj;
	}

	
}
