package org.comstudy21.myapp.speaker;

public class SamsungSpeaker implements Speaker {
	private String maker = "SamsungSpeaker";
	
	public SamsungSpeaker() {
		System.out.println(maker + "객체 생성 !");
	}
	
	@Override
	public void volumeUp() {
		System.out.println(maker + "소리 올리기 !");
	}

	@Override
	public void volumeDown() {
		System.out.println(maker + "소리 내리기 !");
	}
}
