package org.comstudy21.myapp;

import org.comstudy21.myapp.tv.TV;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvUser {

	public static void main(String[] args) {
		//Lookup
		String res = "application-context.xml";
		AbstractApplicationContext factory = new GenericXmlApplicationContext(res);
		
		TV tv = (TV)factory.getBean("lg");	//new 생길때마다 의존성 생김
		tv.volumeUp();
		tv.volumeDown();
	}

}
