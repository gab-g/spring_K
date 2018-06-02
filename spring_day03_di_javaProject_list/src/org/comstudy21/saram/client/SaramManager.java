package org.comstudy21.saram.client;

import java.util.ArrayList;
import java.util.Collections;

import org.comstudy21.saram.model.Saram;

public class SaramManager {
	
	public static void main(String[] args) {
//		Saram saram = new Saram("hong", "Gildong", 23);
//		System.out.println(saram);
		
		Saram[] saramArr = {
			new Saram("aaa", "AAAA", 20),	
			new Saram("bbb", "BBBB", 21),	
			new Saram("ccc", "CCCC", 22),	
			new Saram("ddd", "DDDD", 23),	
			new Saram("eee", "EEEE", 24)	
		};
		
		ArrayList<Saram> list = new ArrayList<>();
		Collections.addAll(list, saramArr);
		for(Saram saram : list){
			System.out.println(saram);
		}
		
		Saram[] arr2 = new Saram[list.size()];
		list.toArray(arr2);
		for(Saram saram : arr2){
			System.out.println(saram);
		}
		
	}
}
