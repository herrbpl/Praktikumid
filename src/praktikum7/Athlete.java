package praktikum7;

public class Athlete extends Human implements Comparable<Athlete> {
	
	private String name;
	private Double result;
	
	public Athlete(String name, double result) {
		this.setName(name);
		this.setResult(result);
	}
	
	@Override
	public String toString() {
		return String.format("Athlete %s, has a record of %.2f", getName(), getResult());
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	@Override
	public void greet() {
		// TODO
		if (this.age < 4) { 
			System.out.format("Buu buu\n");
		} else {
			System.out.format("Tere, minu nimi on %s, olen %d-aastane ja minu tulemus on %f.\n", this.getName(), this.age, this.getResult());
		}
	}

	@Override
	public int compareTo(Athlete o) {
		// TODO Auto-generated method stub
		return -o.getResult().compareTo(this.getResult());		
	}
	
}
