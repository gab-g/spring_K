package org.comstudy21.polymorphism;

import java.util.HashMap;
import java.util.Map;

public class BeanFactory {
	private static BeanFactory instance;
	Map<String, Object> mapping = new HashMap<>();
	
	private BeanFactory(){
		//외부에서 생성금지 !
		
		//TvUser에서 사용할 TV 인스턴스 준비
		mapping.put("SAMSUNG", new SamsungTV());
		mapping.put("LG", new LgTV());
	}
	
	public static BeanFactory getInstance() {
		if(instance == null) {
			instance = new BeanFactory();
		}
		return instance;
	}
	
	
	public Object getBean(String key){
		return mapping.get(key);
	}
}
