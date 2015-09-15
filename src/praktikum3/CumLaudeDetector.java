package praktikum3;

import lib.TextIO;

public class CumLaudeDetector {

	static boolean isValidAverage(double hinne, double max) {
		return (hinne >= 0 && hinne <= max);
	}
	
	static boolean isValidMark(int hinne, int max) {
		return (hinne >= 0 && hinne <= max);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d_hinne ; 
		int i_loputoo ;
		
		do {
		
			d_hinne = -1;
			i_loputoo = -1;
			
			while (!isValidAverage(d_hinne, 5)) {
				System.out.println("Sisesta kaalutud keskmine hinne (0..5) komakohtadega:");	
				d_hinne = TextIO.getlnDouble();
			}
			
			while (!isValidMark(i_loputoo, 5)) {
				System.out.println("Sisesta lõputöö hinne (0..5) täisarvuna:");
				i_loputoo = TextIO.getlnInt();
			}
			
			if (i_loputoo == 5 && d_hinne > 4.5) {
				System.out.println("Jah saad cum laude diplomile!");
			} else {
				System.out.println("Ei saa!");
			}		
			System.out.println("Korrata? [y/n]");
		} while(TextIO.getChar() == 'y');
	}
	
	
  
}
