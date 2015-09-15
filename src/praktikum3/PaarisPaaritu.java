package praktikum3;

import lib.TextIO;

public class PaarisPaaritu {
	public static void main(String[] args) {
		System.out.println("Sisesta täisarv: ");
		int i = TextIO.getInt();
		if (i % 2 == 0) {
			System.out.format("%d on paaris\n", (i % 2) );
		} else {
			System.out.format("%d on paaritu\n", (i % 2) );
		}
	
 	}
}
