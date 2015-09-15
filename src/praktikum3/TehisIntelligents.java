package praktikum3;

import lib.TextIO;

public class TehisIntelligents {

	

	static boolean isValidAge(int age, int max) {		
		return (age >= 0 && age <= max);
	}
	
	private static String test(int i_age1, int i_age2) {
		assert i_age1 < 0 : "i_age1 must be zero or more ";
		assert i_age2 < 0 : "i_age2 must be zero or more ";
		int i_dif =Math.abs(i_age1 - i_age2); 
		
		if (i_dif < 5 ) {
			return "okei";
		} else if (i_dif >= 5 && i_dif < 10 ) {
			return "suht okei";
		} else if (i_dif >= 10 && i_dif < 15 ) {
			return "veits kahtlane ";
		}
		
		return "ei ole okei";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1, i2;
		
		
		// main loop
		
		do {
		
			// initialize;
			i1 = i2 = -1;
			
			while (!isValidAge(i1, 115)) {
				System.out.print("Sisesta vanus 1:");
				i1 = TextIO.getInt();			
			}
			while (!isValidAge(i2, 115)) {
				System.out.print("Sisesta vanus 2:");
				i2 = TextIO.getInt();
			}
					
			System.out.println( test(i1, i2) );
			System.out.println("Korrata? [y/n]");
		} while(TextIO.getChar() == 'y');
		
	}

}
