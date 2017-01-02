/**
 *
 * file_name   : DependencyByStaticFactory.java
 * @date       : 2016年12月28日
 * @author     : Ricardo Shaw
 * @email      : ricardoshaw@qq.com
 * @changedate : 下午4:36:52
 * 
 **/
package cn.javass.spring.chapter2;

import cn.javass.spring.chapter1.IHelloWorld;

/**
 * @author : Ricardo Shaw
 * @date   : 2016年12月28日 下午4:36:52
 */
public class DependencyByStaticFactory {
	
	public static IHelloWorld newInstance(int index,String message){
		return new HelloWorld_2_Impl(index,message);
	}
}
