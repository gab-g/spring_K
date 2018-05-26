package org.comstudy21.myapp.tv;

public class LgTV implements TV {
	private String name = "LgTV";
	
	public LgTV() {
		System.out.println("LgTV 생성자 !");
	}

	public void initMethod() {
		System.out.println("LgTv의 초기화 메소드");
	}
	
	public void close() {
		System.out.println("LgTv의 destroy 메소드");
	}
	
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
