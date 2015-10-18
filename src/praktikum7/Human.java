package praktikum7;
public class Human implements Comparable<Human> {

	public String name;
	public int age;
	
	public Human() {
		// TODO Auto-generated constructor stub
		this.name = "";
		this.age = -1;
	}
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void greet() {
		// TODO
		if (this.age < 4) { 
			System.out.format("Buu buu\n");
		} else {
			System.out.format("Tere, minu nimi on %s, olen %d-aastane.\n", this.name, this.age);
		}
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int compareTo(Human o) {
		// TODO Auto-generated method stub
		return 0;
	}


}
