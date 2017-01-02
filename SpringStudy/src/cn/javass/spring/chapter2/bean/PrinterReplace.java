/**
 *
 * file_name   : PrinterReplace.java
 * @date       : 2016年12月29日
 * @author     : Ricardo Shaw
 * @email      : ricardoshaw@qq.com
 * @changedate : 下午3:12:34
 * 
 **/
package cn.javass.spring.chapter2.bean;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

/**
 * @author : Ricardo Shaw
 * @date   : 2016年12月29日 下午3:12:34
 */
public class PrinterReplace implements MethodReplacer {


	public Object reimplement(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {
		System.out.println("Printer Replace");
		return null;
	}

}
