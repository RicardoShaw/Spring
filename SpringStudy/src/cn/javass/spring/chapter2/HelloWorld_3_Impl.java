/**
 *
 * file_name   : HelloWorld_3_Impl.java
 * @date       : 2016年12月28日
 * @author     : Ricardo Shaw
 * @email      : ricardoshaw@qq.com
 * @changedate : 下午5:07:52
 * 
 **/
package cn.javass.spring.chapter2;

import cn.javass.spring.chapter1.IHelloWorld;

/**
 * @author : Ricardo Shaw
 * @date   : 2016年12月28日 下午5:07:52
 */
public class HelloWorld_3_Impl implements IHelloWorld {
	private int index;
	private String message;
	private boolean flag;
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public void sayHello() {
		System.out.println(index+" | "+message+" | "+flag);
	}
	
	
	
}
