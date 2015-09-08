package praktikum2;

import lib.TextIO;

public class Nimepikkus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sisesta nimi:");
		String nimi = TextIO.getlnString();
		int nimePikkus = nimi.length();
		System.out.println(nimePikkus);		
	}

}
