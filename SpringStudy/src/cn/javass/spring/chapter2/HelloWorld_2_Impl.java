/**
 *
 * file_name   : HelloWorld_2_Impl.java
 * @date       : 2016年12月28日
 * @author     : Ricardo Shaw
 * @email      : ricardoshaw@qq.com
 * @changedate : 下午4:05:34
 * 
 **/
package cn.javass.spring.chapter2;

import java.beans.ConstructorProperties;

import cn.javass.spring.chapter1.IHelloWorld;

/**
 * @author : Ricardo Shaw
 * @date   : 2016年12月28日 下午4:05:34
 */
public class HelloWorld_2_Impl implements IHelloWorld {
	
	private int index;
	private String message;
	
	public HelloWorld_2_Impl(){
		this.index=0;
		this.message="构造器初始化";
	}
	
	@ConstructorProperties(value = { "index" ,"message"})
	public HelloWorld_2_Impl(int index,String message){
		this.index = index;
		this.message = message;
	}
	

	public void sayHello() {
			System.out.println(index+" |"+message);
	}

}
