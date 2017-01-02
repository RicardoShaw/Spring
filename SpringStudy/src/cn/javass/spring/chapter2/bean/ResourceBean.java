/**
 *
 * file_name   : ResourceBean.java
 * @date       : 2016年12月28日
 * @author     : Ricardo Shaw
 * @email      : ricardoshaw@qq.com
 * @changedate : 下午8:18:43
 * 
 **/
package cn.javass.spring.chapter2.bean;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @author : Ricardo Shaw
 * @date   : 2016年12月28日 下午8:18:43
 */
public class ResourceBean {
	private FileOutputStream fos;
	private File file;
	public FileOutputStream getFos() {
		return fos;
	}
	public void setFos(FileOutputStream fos) {
		this.fos = fos;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	
	
	public void init(){
		System.out.println("ResourceBean:========= 初始化");
		System.out.println("ResourceBean:========= 加载资源，执行一些与操作");
		try{
			this.fos = new FileOutputStream(file);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void destroy(){
		System.out.println("ResourceBean:========= 销毁");
		System.out.println("ResourceBean:========= 释放资源，执行一些清理操作");
		try{
			this.fos.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
}
