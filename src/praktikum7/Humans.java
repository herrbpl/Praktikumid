package praktikum7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lib.TextIO;

public class Humans {
	
	List<Human> humans;
	
	
	
	Humans() {
		humans = new ArrayList<Human>();	
	}
	
	
	
	void gatherCrowd() {
		this.humans.clear();
		System.out.println("Sisesta nimed või tühi rida");
		while (true) {
			System.out.format("Sisesta nimi:");
			String name = TextIO.getlnString();
			if (name.isEmpty()) {
				break;
			} else {
				Human h = new Human(name, -1);
				this.humans.add(h);
			}
		}				
		
		for (Iterator<Human> iterator = humans.iterator(); iterator.hasNext();) {
			Human human = (Human) iterator.next();
			human.age = this.askAge(human.name);						
		}
		
		
	}

	protected int askAge(String name) {
		// TODO Auto-generated method stub
		int age = -1;		
		while (age < 0 || age > 120) {
			System.out.format("Sisesta %s vanus (0-120)",name);
			age = TextIO.getlnInt();
		}
		
		return age;
	}

	
	
	


	public void greet() {	
		// TODO Auto-generated method stub
		for (Iterator<Human> iterator = humans.iterator(); iterator.hasNext();) {
			Human human = (Human) iterator.next();
			human.greet();
		}
	}
	
}
