/**
 *
 * file_name   : JsonTest.java
 * @date       : 2017年1月1日
 * @author     : Ricardo Shaw
 * @email      : ricardoshaw@qq.com
 * @changedate : 下午3:35:09
 * 
 **/
package cn.javass.json;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.Test;

/**
 * @author : Ricardo Shaw
 * @date   : 2017年1月1日 下午3:35:09
 */
public class JsonTest {

	@Test
	public void jsonTest() throws JSONException{  
	    JSONObject json=new JSONObject();  
	    JSONArray jsonMembers = new JSONArray();  
	    JSONObject member1 = new JSONObject();  
	    member1.put("loginname", "zhangfan");  
	    member1.put("password", "userpass");  
	    member1.put("email","10371443@qq.com");  
	    member1.put("sign_date", "2007-06-12");  
	    jsonMembers.put(member1);  
	  
	    JSONObject member2 = new JSONObject();  
	    member2.put("loginname", "zf");  
	    member2.put("password", "userpass");  
	    member2.put("email","8223939@qq.com");  
	    member2.put("sign_date", "2008-07-16");  
	    jsonMembers.put(member2);  
	    json.put("users", jsonMembers);  
	  
	    System.out.println( json.toString());  
	}  
	
	@Test
	public void readJson() throws FileNotFoundException, JSONException{
		JSONObject obj = new JSONObject(new JSONTokener(new FileReader("C:/data.json")));
		System.out.println(obj.toString());
	}

}
