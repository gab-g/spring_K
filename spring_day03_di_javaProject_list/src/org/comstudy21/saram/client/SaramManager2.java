package org.comstudy21.saram.client;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.comstudy21.saram.di.CollectionBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SaramManager2 {
	public static Object getBean(String beanName) {
		String res = "application-context2.xml";
		AbstractApplicationContext fac = new GenericXmlApplicationContext(res);
		
		return fac.getBean(beanName);
	}
	
	public static void main(String[] args) {
		CollectionBean bean = (CollectionBean)getBean("collectionBean");
		Properties list = bean.getSaramProp();
		System.out.println(list);
	}
	
	public static void mapTest(String[] args) {
		CollectionBean bean = (CollectionBean)getBean("collectionBean");
		Map<String, String> map = bean.getSaramMap();
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " >>> " + map.get(key));
		}
		System.out.println(map);
	}
	
	public static void setTest(String[] args) {
		CollectionBean bean = (CollectionBean)getBean("collectionBean");
		Set<String> set = bean.getSaramSet();
		System.out.println(set);
	}
	
	public static void listTest(String[] args) {
		String res = "application-context.xml";
		AbstractApplicationContext fac = new GenericXmlApplicationContext(res);
		
		CollectionBean bean = (CollectionBean)getBean(res);
//		List<Saram> list =;
//		System.out.println(list);
	}
}
