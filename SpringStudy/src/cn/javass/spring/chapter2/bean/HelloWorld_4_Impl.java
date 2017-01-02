/**
 *
 * file_name   : HelloWorld_4_Impl.java
 * @date       : 2016年12月29日
 * @author     : Ricardo Shaw
 * @email      : ricardoshaw@qq.com
 * @changedate : 下午2:22:52
 * 
 **/
package cn.javass.spring.chapter2.bean;

import cn.javass.spring.chapter1.IHelloWorld;

/**
 * @author : Ricardo Shaw
 * @date   : 2016年12月29日 下午2:22:52
 */
public abstract class HelloWorld_4_Impl implements IHelloWorld {
	private Printer printer;
	

	public void sayHello() {
		printer.print("setter");
		createPrototypePrinter().print("prototype");
		createSingletonPrinter().print("singleton");
	}
	
	public abstract Printer createPrototypePrinter();
	
	public Printer createSingletonPrinter(){
		System.out.println("该方法不会被执行，如果输出就错了");
		return new Printer();
	}

	public Printer getPrinter() {
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

}
