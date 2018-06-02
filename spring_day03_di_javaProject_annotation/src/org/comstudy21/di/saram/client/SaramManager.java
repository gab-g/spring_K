package org.comstudy21.di.saram.client;

import org.comstudy21.di.saram.Saram;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SaramManager {

	public static void main(String[] args) {
		String res = "application-context.xml";
		AbstractApplicationContext fac = new GenericXmlApplicationContext(res);
		
		Saram saram = (Saram)fac.getBean("rambo");
		saram.say();
		saram.work();
		
	}

}
