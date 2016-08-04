package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.Collection1;


public class Test {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
		Collection1 c = (Collection1)appContext.getBean(Collection1.class);
		c.printAll();
		((ClassPathXmlApplicationContext)appContext).close();
	}

}
