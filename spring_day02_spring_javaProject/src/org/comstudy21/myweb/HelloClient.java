package org.comstudy21.myweb;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloClient {

	public static void main(String[] args) {
//		HelloWorld hw = new HelloWorld();
//		hw.sayHello("갑지");
		
		/**
		 * 교재 p52 참조
		 */
		String res = "application-context.xml";
		AbstractApplicationContext factory = new GenericXmlApplicationContext(res);
		HelloWorld hw = (HelloWorld)factory.getBean("helloWorld");
		hw.sayHello("갑지");
	}

}
