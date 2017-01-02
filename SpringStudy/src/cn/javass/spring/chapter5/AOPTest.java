/**
 *
 * file_name   : AOPTest.java
 * @date       : 2016年12月30日
 * @author     : Ricardo Shaw
 * @email      : ricardoshaw@qq.com
 * @changedate : 下午5:05:31
 * 
 **/
package cn.javass.spring.chapter5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author : Ricardo Shaw
 * @date   : 2016年12月30日 下午5:05:31
 */
@Service
public class AOPTest {

	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cn/javass/spring/chapter5/helloAOP.xml");
		IHelloWorldService helloworldService = ctx.getBean("helloWorldService",cn.javass.spring.chapter5.HelloWorldService.class);
		helloworldService.sayHello();
		
	}

}
