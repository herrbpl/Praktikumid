package praktikum2;

import lib.TextIO;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sisesta string:");
		String sisend = TextIO.getln();
		System.out.println(sisend.replaceAll("[aA]", "ss"));
	}

}
