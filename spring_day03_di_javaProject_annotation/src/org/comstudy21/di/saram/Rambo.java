package org.comstudy21.di.saram;

import org.comstudy21.di.saram.weapon.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("rambo")
public class Rambo implements Saram {
	@Autowired
	@Qualifier(value="gun")
	private Weapon weapon;
	
	@Override
	public void say() {
		System.out.println("람보가 말");
	}

	@Override
	public void work() {
		System.out.println("람보가 총");
		weapon.play();
	}

}
