package cn.slnspring.junit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.slnspring.dao.IHelloworld;
import cn.slnspring.idao.Helloworld;

public class HelloworldTest {
	// 1、读取配置文件实例化一个IoC容器
	static ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	public static void main(String[] args) {
		
		IHelloworld  hel=getBean("helloworld",Helloworld.class);
		// 3、执行业务逻辑
		hel.sayContent();
				
		//Helloworld  hel=getBean("helloworld",Helloworld.class);
		//System.out.println(hel.getValues().size());
		//System.out.println(hel.getColle().size());
	}
	
	public static <T> T getBean(String beanid,Class<T> cls){
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
		T t =(T) context.getBean(beanid,cls);
		return t;
	}
	
}
