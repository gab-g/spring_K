package org.comstudy21.di.saram;

import javax.annotation.Resource;

import org.comstudy21.di.saram.weapon.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("brouceLee")
public class BrouceLee implements Saram {
//	@Autowired
//	@Qualifier(value="sword")
	@Resource(name="sword")
	private Weapon weapon;
	
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
