package Subject;

import java.util.ArrayList;

import Observe.Person;

public class Radio{
	
	private ArrayList<Person> persons = new ArrayList<Person>();
	
	public void addPerson(Person person) {
		persons.add(person);
	}
	
	public void notify(String message) {
		for(Person person : persons) {
			person.notify(message);
		}
	}
	
}
