package praktikum7;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

import lib.TextIO;

public class Athletes<T> extends Humans {
	
	
	
	
	@Override
	void gatherCrowd() {
		// TODO Auto-generated method stub
		this.gatherCrowd(false);
	}
	
	void gatherCrowd(boolean askAge) {
		// TODO Auto-generated method stub
		this.humans.clear();
		System.out.println("Sisesta nimi ja tulemus kuju \"nimi tulemus\" või tühi rida");
		while (true) {
			System.out.format("Sisesta nimi ja tulemus:");
			String nameAndResult = TextIO.getlnString();			
			if (nameAndResult.isEmpty()) {
				break;
			} else {
				if (nameAndResult.matches("^((\\w)+)+ (((\\d)+)+(.{0,1}(\\d)*))+$")) {
					System.out.format("%s is good\n", nameAndResult);
					String[] parts = nameAndResult.split(" ");
					double result = Double.parseDouble(parts[1]);
					Athlete a = new Athlete(parts[0],result);
					
					if (askAge) {						
						a.age = this.askAge(parts[0]);						
					}
					
					this.humans.add(a);
					
				} else {
					System.out.format("%s is not good\n", nameAndResult);
				}
								
			}
		}				
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		// Sorteerime tulemuste järgi kahanevas järjekorras
				
		Collections.sort(this.humans, );
		return "";
	} 

}
