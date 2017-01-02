/**
 *
 * file_name   : Chapter2Test.java
 * @date       : 2016年12月28日
 * @author     : Ricardo Shaw
 * @email      : ricardoshaw@qq.com
 * @changedate : 下午5:00:32
 * 
 **/
package cn.javass.spring.chapter2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.javass.spring.chapter1.IHelloWorld;

/**
 * @author : Ricardo Shaw
 * @date   : 2016年12月28日 下午5:00:32
 */
public class Chapter2Test {

	@Test
	public void testIHelloWorld_2_Impl(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");	
		IHelloWorld ihelloworld1 = context.getBean("helloByIndex",cn.javass.spring.chapter2.HelloWorld_2_Impl.class);
		ihelloworld1.sayHello();
		IHelloWorld ihelloworld2 = context.getBean("helloByType",cn.javass.spring.chapter2.HelloWorld_2_Impl.class);
		ihelloworld2.sayHello();
		IHelloWorld ihelloworld3 = context.getBean("helloByName",cn.javass.spring.chapter2.HelloWorld_2_Impl.class);
		ihelloworld3.sayHello();
	}
	
	@Test
	public void testDStaticFactory(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");	
		IHelloWorld ihelloworld1 = context.getBean("helloByStaticFactory_Index",cn.javass.spring.chapter2.HelloWorld_2_Impl.class);
		ihelloworld1.sayHello();
		IHelloWorld ihelloworld2 = context.getBean("helloByStaticFactory_Type",cn.javass.spring.chapter2.HelloWorld_2_Impl.class);
		ihelloworld2.sayHello();
		IHelloWorld ihelloworld3 = context.getBean("helloByStaticFactory_Name",cn.javass.spring.chapter2.HelloWorld_2_Impl.class);
		ihelloworld3.sayHello();
	}
	
	@Test
	public void testDInstanceFactory(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");	
		IHelloWorld ihelloworld1 = context.getBean("helloByInstanceFactory_Index",cn.javass.spring.chapter2.HelloWorld_2_Impl.class);
		ihelloworld1.sayHello();
		IHelloWorld ihelloworld2 = context.getBean("helloByInstanceFactory_Type",cn.javass.spring.chapter2.HelloWorld_2_Impl.class);
		ihelloworld2.sayHello();
		IHelloWorld ihelloworld3 = context.getBean("helloByInstanceFactory_Name",cn.javass.spring.chapter2.HelloWorld_2_Impl.class);
		ihelloworld3.sayHello();
	}
	
	@Test
	public void testSetterDependencyInject(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");	
		IHelloWorld ihelloworld1 = context.getBean("HelloWorld_3",cn.javass.spring.chapter2.HelloWorld_3_Impl.class);
		ihelloworld1.sayHello();
		IHelloWorld ihelloworld2 = context.getBean("HelloWorld_3ByBeanInject",cn.javass.spring.chapter2.HelloWorld_3_Impl.class);
		ihelloworld2.sayHello();
	}
	
	
	@Test
	public void testListBean(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ListPrint listprint = context.getBean("listBean",cn.javass.spring.chapter2.ListBean.class);
		listprint.print();
	}
	
	@Test
	public void testHelloWorldServiceImpl(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorldService helloworldservice = context.getBean("helloWorldService",cn.javass.spring.chapter2.HelloWorldServiceImpl.class);
		helloworldservice.helloPrint1();
		helloworldservice.helloPrint2();
	}
	
	
	
}
