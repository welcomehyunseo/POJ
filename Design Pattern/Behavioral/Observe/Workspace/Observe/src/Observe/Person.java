package Observe;

import Subject.Radio;

public class Person {
	private Radio radio;
	private String name;
	
	public Person(Radio radio, String name) {
		this.radio = radio;
		this.name = name;
		
		radio.addPerson(this);
	}
	
	public void report(String message) {
		if(radio == null) return;
		
		radio.notify(message);
	}
	
	public void notify(String message) {
		if(message == null) return;
		
		System.out.println(name + "님이 '" + message + "' 이라는 소식을 들었습니다.");
	}
}
