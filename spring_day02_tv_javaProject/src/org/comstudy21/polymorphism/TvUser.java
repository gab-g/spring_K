package org.comstudy21.polymorphism;

public class TvUser {

	public static void main(String[] args) {
		BeanFactory factory = BeanFactory.getInstance();
		TV tv = (TV)factory.getBean(args[0]);	//new 생길때마다 의존성 생김
		tv.powerOn();
		tv.powerOff();
	}

}
