/**
 *
 * file_name   : DependencyByInstanceFactory.java
 * @date       : 2016年12月28日
 * @author     : Ricardo Shaw
 * @email      : ricardoshaw@qq.com
 * @changedate : 下午4:35:42
 * 
 **/
package cn.javass.spring.chapter2;

import cn.javass.spring.chapter1.IHelloWorld;

/**
 * @author : Ricardo Shaw
 * @date   : 2016年12月28日 下午4:35:42
 */
public class DependencyByInstanceFactory {
	public IHelloWorld newInstance(int index,String message){
		return new HelloWorld_2_Impl(index,message);
	}
}
