package org.comstudy21.myapp.tv;

import org.comstudy21.myapp.speaker.Speaker;

public class SamsungTV implements TV {
	private String name = "SamsungTV";
	private Speaker speaker;

	public SamsungTV() {
		System.out.println("SamsungTV 생성자 !");
	}
	
	public SamsungTV(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
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
