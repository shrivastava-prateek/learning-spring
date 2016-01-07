package com.mypack;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyDemoUse implements ApplicationContextAware {//making aware of the particular object of the container which is already created
	                                                       //this is done by ApplicationContextAware
	
	private MyDemo demo;
	private int useId;
	private ApplicationContext context;
	
	public int getUseId() {
		return useId;
	}
	public void setUseId(int useId) {
		this.useId = useId;
	}
	
	public void showDemoUse(){
		System.out.println("id:-"+useId);
		System.out.println("demo info is "+demo);
	}
	
	
	public ApplicationContext getContext() {
		return context;
	}
	public void setContext(ApplicationContext context) {
		this.context = context;
	}
	
   /* public MyDemo getDemo() {
		MyDemo demo1 = (MyDemo)context.getBean("mydemo");
		return demo1;
	}*/
	
	public MyDemo getDemo(int criteria) {
		MyDemo demo1=null;
		if(criteria==1){
			demo1 = (MyDemo)context.getBean("mydemo_new");
			return demo1;
		}
		else if(criteria==2){
			demo1 = (MyDemo)context.getBean("mydemo");
			return demo1;
		}
		return demo1;
	}
	
	public void setDemo(MyDemo demo) {
		this.demo = demo;
	}
	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		this.context=arg0;
	}

}
