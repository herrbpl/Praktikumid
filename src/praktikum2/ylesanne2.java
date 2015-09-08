package praktikum2;

import lib.TextIO;

public class ylesanne2 {
	static void lahenda() {
		System.out.println("Sisesta arv 1:");
		int i1 = TextIO.getInt();
		System.out.println("Sisesta arv 2:");
		int i2 = TextIO.getInt();
		try {
			System.out.format("%d * %d = %d\n", i1, i2, (i1*i2));
			System.out.println("Ülesanne 2 lahendatud");			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
}
