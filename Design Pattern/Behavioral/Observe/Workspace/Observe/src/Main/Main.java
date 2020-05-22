package Main;

import Observe.Person;
import Subject.Radio;

public class Main {

	public static void main(String[] args) {
		Radio radio = new Radio();
		
		Person p1 = new Person(radio, "Kely");
		Person p2 = new Person(radio, "Brian");
		
		p1.report("어제 우리 집 옆에서 산불이 났어!");
	}

}
