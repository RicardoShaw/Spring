/**
 *
 * file_name   : Singleton.java
 * @date       : 2016年12月29日
 * @author     : Ricardo Shaw
 * @email      : ricardoshaw@qq.com
 * @changedate : 下午5:16:10
 * 
 **/
package cn.javass.spring.chapter2.bean;

/**
 * @author : Ricardo Shaw
 * @date   : 2016年12月29日 下午5:16:10
 */
public class Singleton {
	private Singleton(){}
	
	private static class InstanceHolder{
		private  static final Singleton INSTANCE = new Singleton();
	}
	
	public static Singleton getInstance(){
		return InstanceHolder.INSTANCE;
	}
	
	private int counter = 0;
}
