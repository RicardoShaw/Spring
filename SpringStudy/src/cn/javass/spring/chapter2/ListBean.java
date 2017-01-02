/**
 *
 * file_name   : ListBean.java
 * @date       : 2016年12月28日
 * @author     : Ricardo Shaw
 * @email      : ricardoshaw@qq.com
 * @changedate : 下午5:33:49
 * 
 **/
package cn.javass.spring.chapter2;

import java.util.List;
import java.util.Set;

/**
 * @author : Ricardo Shaw
 * @date   : 2016年12月28日 下午5:33:49
 */
public class ListBean implements ListPrint{
		private List<String> values;
		private Set<String>  values1;
		
		public Set<String> getValues1() {
			return values1;
		}
		public void setValues1(Set<String> values1) {
			this.values1 = values1;
		}
		public List<String> getValues() {
			return values;
		}
		public void setValues(List<String> values) {
			this.values = values;
		}

		public void print() {
				for(String value: values){
					System.out.print(value + "　");
				}
				System.out.println( "\n　-----------------------------      ");
				for(String value:values1){
					System.out.print(value + "　");
				}
		}
		
		
}
