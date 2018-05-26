package org.comstudy21.polymorphism;

public class SamsungTV implements TV {
	private String name = "SamsungTV";

	@Override
	public void powerOn() {
		System.out.println(name + " 전원을 켠다.");
	}

	@Override
	public void powerOff() {
		System.out.println(name + " 전원을 끈다.");
	}

	@Override
	public void volumeUp() {
		System.out.println(name + " 볼륨을 높인다.");
	}

	@Override
	public void volumeDown() {
		System.out.println(name + " 볼륨을 내린다.");
	}

}
