/**
 *
 * file_name   : IHelloWorldStaticFactory.java
 * @date       : 2016年12月28日
 * @author     : Ricardo Shaw
 * @email      : ricardoshaw@qq.com
 * @changedate : 下午3:31:46
 * 
 **/
package cn.javass.spring.chapter1;

/**
 * @author : Ricardo Shaw
 * @date   : 2016年12月28日 下午3:31:46
 */
public class IHelloWorldStaticFactory {
		public static IHelloWorld newInstacne(String message){
			return new HelloWorld_1_Impl(message);
		}
}
