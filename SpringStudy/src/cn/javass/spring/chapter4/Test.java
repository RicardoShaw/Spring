/**
 *
 * file_name   : Test.java
 * @date       : 2016年12月29日
 * @author     : Ricardo Shaw
 * @email      : ricardoshaw@qq.com
 * @changedate : 下午7:09:15
 * 
 **/
package cn.javass.spring.chapter4;

import java.sql.Date;

import junit.framework.Assert;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.ParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;



/**
 * @author : Ricardo Shaw
 * @date   : 2016年12月29日 下午7:09:15
 */
public class Test {

	@org.junit.Test
	public void test() {
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("('Hello'+' World').concat(#end)");
		EvaluationContext context = new StandardEvaluationContext();
		context.setVariable("end", "!");
		Assert.assertEquals("Hello World!",expression.getValue(context));
	}
	
	
	@org.junit.Test
	public void test1(){
		ExpressionParser parser = new SpelExpressionParser();
		ParserContext parserContext = new ParserContext(){
			public boolean isTemplate(){
				return true;
			}


			public String getExpressionPrefix() {
			
				return "#{";
			}


			public String getExpressionSuffix() {
				// TODO Auto-generated method stub
				return "}";
			}
		};
		String template = "#{'Hello '}#{'World!'}";
		Expression expression = parser.parseExpression(template, parserContext);
		Assert.assertEquals("Hello World!", expression.getValue());
		
		
	}
	
	@org.junit.Test
	public void testClassTypeExpression(){
		ExpressionParser parser = new SpelExpressionParser();
		
		Class<String> result1 = parser.parseExpression("T(String)").getValue(Class.class);
		Assert.assertEquals(String.class, result1);
		
		String expression2 = "T(cn.javass.spring.chapter4.Test)";
		Class<String> result2 = parser.parseExpression(expression2).getValue(Class.class);
		Assert.assertEquals(Test.class, result2);
		
		int result3 = parser.parseExpression("T(Integer).MAX_VALUE").getValue(int.class);
		Assert.assertEquals(Integer.MAX_VALUE,result3);
		
		int result4 = parser.parseExpression("T(Integer).parseInt('1')").getValue(int.class);
		Assert.assertEquals(1, result4);
	}
	
	@org.junit.Test
	public void testConstructorExpression(){
		ExpressionParser parser = new SpelExpressionParser();
		String result1 = parser.parseExpression("new String('haha')").getValue(String.class);
		Assert.assertEquals("haha", result1);
		Date result2 = parser.parseExpression("new java.util.Date()").getValue(Date.class);
		Assert.assertNotNull(result2);
	
	}
	
	
}
