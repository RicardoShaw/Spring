/**
 *
 * file_name   : DependentBean.java
 * @date       : 2016年12月28日
 * @author     : Ricardo Shaw
 * @email      : ricardoshaw@qq.com
 * @changedate : 下午8:23:20
 * 
 **/
package cn.javass.spring.chapter2.bean;

import java.io.IOException;

/**
 * @author : Ricardo Shaw
 * @date   : 2016年12月28日 下午8:23:20
 */
public class DependentBean {
	ResourceBean resourceBean;
	
	
	
	public ResourceBean getResourceBean() {
		return resourceBean;
	}

	public void setResourceBean(ResourceBean resourceBean) {
		this.resourceBean = resourceBean;
	}

	public void write(String ss) throws IOException{
		System.out.println("DependentBean:====写资源===");
		resourceBean.getFos().write(ss.getBytes());
	}
	
	public void init() throws IOException{
		System.out.println("DependentBean:====初始化===");
		resourceBean.getFos().write("DependentBean:====初始化===".getBytes());
	}
	
	public void destroy() throws IOException{
		System.out.println("DependentBean:====销毁===");
		resourceBean.getFos().write("DependentBean:====销毁===".getBytes());
	}
}
