/**
 *
 * file_name   : Test.java
 * @date       : 2016年12月28日
 * @author     : Ricardo Shaw
 * @email      : ricardoshaw@qq.com
 * @changedate : 下午8:41:22
 * 
 **/
package cn.javass.spring.chapter2.bean;

import static org.junit.Assert.*;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.javass.spring.chapter1.IHelloWorld;

/**
 * @author : Ricardo Shaw
 * @date   : 2016年12月28日 下午8:41:22
 */
public class Test {

	@org.junit.Test
	public void testXX() throws IOException {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		context.registerShutdownHook();
//		DependentBean dependentBean = context.getBean("dependentBean",cn.javass.spring.chapter2.bean.DependentBean.class);
//		dependentBean.write("aaa");
//	
	}
	
	@org.junit.Test
	public void testHelloWorld_4_Impl(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("=====Singleton sayHello=====");
		IHelloWorld ihelloworld1 = context.getBean("helloWorld_4_Impl_Singleton",cn.javass.spring.chapter2.bean.HelloWorld_4_Impl.class);
		ihelloworld1.sayHello();
		ihelloworld1 = context.getBean("helloWorld_4_Impl_Singleton",cn.javass.spring.chapter2.bean.HelloWorld_4_Impl.class);
		ihelloworld1.sayHello();
		System.out.println("=====Prototype sayHello=====");
		IHelloWorld ihelloworld2 = context.getBean("helloWorld_4_Impl_Prototype",cn.javass.spring.chapter2.bean.HelloWorld_4_Impl.class);
		ihelloworld2.sayHello();
		ihelloworld2 = context.getBean("helloWorld_4_Impl_Prototype",cn.javass.spring.chapter2.bean.HelloWorld_4_Impl.class);
		ihelloworld2.sayHello();
		
	}

	@org.junit.Test
	public void testReplacer(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Printer printer = context.getBean("printer",cn.javass.spring.chapter2.bean.Printer.class);
		printer.print("aaa");
	}
	
	
}
