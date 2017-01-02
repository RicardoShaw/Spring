/**
 *
 * file_name   : BeanDefinition.java
 * @date       : 2016年12月29日
 * @author     : Ricardo Shaw
 * @email      : ricardoshaw@qq.com
 * @changedate : 下午6:24:48
 * 
 **/
package cn.javass.spring.chapter2.bean;

/**
 * @author : Ricardo Shaw
 * @date   : 2016年12月29日 下午6:24:48
 */
public class BeanDefinition {
	public static final int SCOPE_SINGLETON=0;
	public static final int SCOPE_PROTOTYPE=1;
	
	private String id;
	
	private String clazz;
	
	private int scope = SCOPE_SINGLETON;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public int getScope() {
		return scope;
	}

	public void setScope(int scope) {
		this.scope = scope;
	}
	
	
}
