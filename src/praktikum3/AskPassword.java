package praktikum3;

import lib.TextIO;

public class AskPassword {
	
	final static String parool = "parool";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s_password;
		do {
		
			System.out.print("Sisesta parool:");
			s_password = TextIO.getlnString();
			
			
		
			if (s_password.equals(parool)) {
				System.out.println("Õige parool!");
			} else {
				System.out.println("Vale parool");
			}
		} while(!s_password.equals(parool));
	}

}
