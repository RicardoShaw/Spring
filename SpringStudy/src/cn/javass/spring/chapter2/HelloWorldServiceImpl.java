/**
 *
 * file_name   : HelloWorldService.java
 * @date       : 2016年12月28日
 * @author     : Ricardo Shaw
 * @email      : ricardoshaw@qq.com
 * @changedate : 下午7:09:23
 * 
 **/
package cn.javass.spring.chapter2;

import cn.javass.spring.chapter1.IHelloWorld;

/**
 * @author : Ricardo Shaw
 * @date   : 2016年12月28日 下午7:09:23
 */
public class HelloWorldServiceImpl implements HelloWorldService{
	private  IHelloWorld helloworld_2;
	private  IHelloWorld helloworld_3;

	public IHelloWorld getHelloworld_2() {
		return helloworld_2;
	}

	public void setHelloworld_2(IHelloWorld helloworld_2) {
		this.helloworld_2 = helloworld_2;
	}

	public IHelloWorld getHelloworld_3() {
		return helloworld_3;
	}

	public void setHelloworld_3(IHelloWorld helloworld_3) {
		this.helloworld_3 = helloworld_3;
	}


	public void helloPrint1() {
		helloworld_2.sayHello();
	}


	public void helloPrint2() {
		helloworld_3.sayHello();
	}

}
