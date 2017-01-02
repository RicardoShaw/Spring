/**
 *
 * file_name   : HelloWorld_1_Impl.java
 * @date       : 2016年12月28日
 * @author     : Ricardo Shaw
 * @email      : ricardoshaw@qq.com
 * @changedate : 下午3:10:51
 * 
 **/
package cn.javass.spring.chapter1;

/**
 * @author : Ricardo Shaw
 * @date   : 2016年12月28日 下午3:10:51
 */
public class HelloWorld_1_Impl implements IHelloWorld{
	private String message;
	public HelloWorld_1_Impl(){
		this.message = "初始化了";
	}
	public HelloWorld_1_Impl(String message){
		this.message = message;
	}
	
	public void sayHello() {
		System.out.println(message);
	}
	
}
