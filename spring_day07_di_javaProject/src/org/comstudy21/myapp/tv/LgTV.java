package org.comstudy21.myapp.tv;

import org.comstudy21.myapp.speaker.Speaker;

public class LgTV implements TV {
	private String name = "LgTV";
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("LgTV 생성자 !");
	}
	
	public LgTV(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
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
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
}
