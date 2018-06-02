package org.comstudy21.di.saram.weapon;

import org.springframework.stereotype.Component;

@Component("sword")
public class Gun implements Weapon{

	@Override
	public void play() {
		System.out.println("총ㅋ");
	}
	
}
