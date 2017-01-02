/**
 *
 * file_name   : HelloWorldText.java
 * @date       : 2016年12月28日
 * @author     : Ricardo Shaw
 * @email      : ricardoshaw@qq.com
 * @changedate : 下午2:38:24
 * 
 **/
package cn.javass.spring.chapter1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : Ricardo Shaw
 * @date   : 2016年12月28日 下午2:38:24
 */
public class HelloWorldText {

	@Test
	public void testHelloWorldImpl() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");	
		IHelloWorld ihelloworld = context.getBean("hello",cn.javass.spring.chapter1.HelloWorldImpl.class);
		ihelloworld.sayHello();
	}

	@Test
	public void testHelloWorld_1_Impl(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");	
		IHelloWorld ihelloworld1 = context.getBean("hello1",cn.javass.spring.chapter1.HelloWorld_1_Impl.class);
		ihelloworld1.sayHello();
		IHelloWorld ihelloworld2 = context.getBean("hello2",cn.javass.spring.chapter1.HelloWorld_1_Impl.class);
		ihelloworld2.sayHello();
	}
	
	
	@Test
	public void testIHelloWorldStaticFactory(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");	
		IHelloWorld ihelloworld1 = context.getBean("hello3",cn.javass.spring.chapter1.HelloWorld_1_Impl.class);
		ihelloworld1.sayHello();
	}
	
	@Test
	public void testIHelloWorldInstanceFactory(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");	
		IHelloWorld ihelloworld1 = context.getBean("hello4",cn.javass.spring.chapter1.HelloWorld_1_Impl.class);
		ihelloworld1.sayHello();
	}
	

	
}
