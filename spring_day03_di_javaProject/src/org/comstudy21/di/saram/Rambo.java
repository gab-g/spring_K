package org.comstudy21.di.saram;

import org.comstudy21.di.saram.weapon.Weapon;

public class Rambo implements Saram {
	private Weapon weapon;
	
	@Override
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

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
