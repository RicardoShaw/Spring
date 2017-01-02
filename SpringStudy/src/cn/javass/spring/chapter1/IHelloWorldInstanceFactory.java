/**
 *
 * file_name   : IHelloWorldInstanceFactory.java
 * @date       : 2016年12月28日
 * @author     : Ricardo Shaw
 * @email      : ricardoshaw@qq.com
 * @changedate : 下午3:43:31
 * 
 **/
package cn.javass.spring.chapter1;

/**
 * @author : Ricardo Shaw
 * @date   : 2016年12月28日 下午3:43:31
 */
public class IHelloWorldInstanceFactory {
	public IHelloWorld newInstance(String message){
		return new HelloWorld_1_Impl(message);
	}
}
