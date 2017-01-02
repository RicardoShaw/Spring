/**
 *
 * file_name   : Printer.java
 * @date       : 2016年12月29日
 * @author     : Ricardo Shaw
 * @email      : ricardoshaw@qq.com
 * @changedate : 下午2:17:55
 * 
 **/
package cn.javass.spring.chapter2.bean;

/**
 * @author : Ricardo Shaw
 * @date   : 2016年12月29日 下午2:17:55
 */
public class Printer {
	private int count = 0 ;
	
	public void print(String type){
		System.out.println(type+" | printer: "+count++);
	}
	
}
