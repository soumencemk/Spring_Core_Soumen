package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soumen.springcore.bean.HelloWorld;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringContext.xml");
		HelloWorld bean = (HelloWorld) ctx.getBean("helloWorldBean");
		bean.printMessage();
	}

}
