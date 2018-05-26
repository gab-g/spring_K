package org.comstudy21.myapp.tv;
/**
 * interface : 규격
 * - 다형성때문에 사용
 * - 하나의 클래스에 여러가지 타입 추가 가능
 * */
public interface TV {
	public void powerOn();
	public void powerOff();
	public void volumeUp();
	public void volumeDown();
}
