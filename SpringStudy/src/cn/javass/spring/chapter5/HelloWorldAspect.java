/**
 *
 * file_name   : HelloWorldAspect.java
 * @date       : 2016年12月30日
 * @author     : Ricardo Shaw
 * @email      : ricardoshaw@qq.com
 * @changedate : 下午5:11:37
 * 
 **/
package cn.javass.spring.chapter5;

/**
 * @author : Ricardo Shaw
 * @date   : 2016年12月30日 下午5:11:37
 */
public class HelloWorldAspect {
	public void beforeAdvice(){
		System.out.println("===============before advice");
	}
	public void afterFinallyAdvice(){
		System.out.println("===============after finally advice");
	}
}
