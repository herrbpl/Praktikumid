package praktikum6;

import java.util.ArrayList;
import java.util.Random;

import lib.TextIO;

public class Liisu {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mitu nime?");		
		int inames = TextIO.getlnInt();
		if (inames <= 0) { 
			return; 
		}
		
		ArrayList<String> nimed = new ArrayList<String>();
		for (int i = 0; i < inames; i++) {
			System.out.format("Sisesta nimi %d:", (i+1));
			String nimi = TextIO.getlnString();
			nimed.add(nimi);
		}
		
		Random rand = new Random();
			
		System.out.println(nimed.get(rand.nextInt(inames)));
		
	}

}
