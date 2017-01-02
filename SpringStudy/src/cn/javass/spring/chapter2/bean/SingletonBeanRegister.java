/**
 *
 * file_name   : SingletonBeanRegister.java
 * @date       : 2016年12月29日
 * @author     : Ricardo Shaw
 * @email      : ricardoshaw@qq.com
 * @changedate : 下午5:18:53
 * 
 **/
package cn.javass.spring.chapter2.bean;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.config.SingletonBeanRegistry;

/**
 * @author : Ricardo Shaw
 * @date   : 2016年12月29日 下午5:18:53
 */
public class SingletonBeanRegister implements SingletonBeanRegistry {
	private final Map<String,Object> BEANS = new HashMap<String,Object>();

	public boolean containsSingleton(String beanName) {
		return BEANS.containsKey(beanName);
	}

	
	public Object getSingleton(String beanName) {
		
		return BEANS.get(beanName);
	}


	public int getSingletonCount() {
	
		return BEANS.size();
	}


	public String[] getSingletonNames() {
		
		return BEANS.keySet().toArray(new String[0]);
	}


	public void registerSingleton(String beanName, Object bean) {
		if(BEANS.containsKey(beanName)){
			throw new RuntimeException("["+beanName+"]已经存在");
		}
		BEANS.put(beanName, bean);
	}

}
