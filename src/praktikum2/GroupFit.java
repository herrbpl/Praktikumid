package praktikum2;

import lib.TextIO;

public class GroupFit {
	static void Solve() {
		
		System.out.println("Inimeste arv: ");
		int numPeople = TextIO.getInt();
		System.out.println("Groupi suurus: ");
		int numGroupSize = TextIO.getInt();
		
		int numGroups = numPeople / numGroupSize;
						
		double numPeopleLeft = numPeople % numGroupSize;
		
		System.out.format("Groupi suurus %d, inimeste arv %d, gruppe %d, jääk %.2f%n", 
				numGroupSize, numPeople, numGroups, numPeopleLeft );
		
		
	}
}
