package org.comstudy21.di.saram;

import org.comstudy21.di.saram.weapon.Weapon;

public class BrouceLee implements Saram {
	private Weapon weapon;
	
	@Override
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	@Override
	public void say() {
		System.out.println("이소룡 말");
	}

	@Override
	public void work() {
		System.out.println("이소룡 일");
		weapon.play();
	}

}
