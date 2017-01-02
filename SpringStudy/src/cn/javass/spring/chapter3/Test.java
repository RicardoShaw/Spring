/**
 *
 * file_name   : Test.java
 * @date       : 2016年12月29日
 * @author     : Ricardo Shaw
 * @email      : ricardoshaw@qq.com
 * @changedate : 下午6:43:02
 * 
 **/
package cn.javass.spring.chapter3;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import junit.framework.Assert;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;


/**
 * @author : Ricardo Shaw
 * @date   : 2016年12月29日 下午6:43:02
 */
public class Test {

	@org.junit.Test
	public void test() {
		Resource resource = new ByteArrayResource("Hello World".getBytes());
		if(resource.exists()){
			dumpStream(resource);
		}
	}
	
	@org.junit.Test
	public void testInputStreamResource(){
		ByteArrayInputStream bis = new ByteArrayInputStream("Hello World".getBytes());
		Resource resource = new InputStreamResource(bis);
		if(resource.exists()){
			dumpStream(resource);
		}
		Assert.assertEquals(true, resource.isOpen());
	}

	
	@org.junit.Test
	public void testFileResource(){
		File file = new File("d:/test.txt");
		Resource resource = new FileSystemResource(file);
		if(resource.exists()){
			dumpStream(resource);
		}
		Assert.assertEquals(false, resource.isOpen());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * @param resource
	 */
	private void dumpStream(Resource resource) {
			InputStream is = null;
			try{
				is = resource.getInputStream();
				byte[] descBytes = new byte[is.available()];
				is.read(descBytes);
				System.out.println(new String(descBytes));
			}catch(IOException e){
				e.printStackTrace();
			}finally{
				try{
					is.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
	}

}
