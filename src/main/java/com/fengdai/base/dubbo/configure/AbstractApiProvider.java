package com.fengdai.base.dubbo.configure;

import java.util.ResourceBundle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Class AbstractApiProvider
 * @Description 抽象的ApiProvider基类
 * @Author jyq
 * @Date 2016年2月25日 上午9:18:45
 */
public abstract class AbstractApiProvider {

	protected ResourceBundle dubboConsumer = ResourceBundle.getBundle("consumer/dubbo-consumer");

	ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"classpath*:config/dubbo-suggestion-consumer-beans.xml" });
	
	public  AbstractApiProvider(){
		applicationContext.start();
	}
	
	protected <T> T getBean(Class<T> clazz){
		return 	applicationContext.getBean(clazz);
	}
	protected  abstract String  register();
}
