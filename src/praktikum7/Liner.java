package praktikum7;

import lib.TextIO;

public class Liner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sisesta rida: ");
		String s = TextIO.getlnString();
		System.out.println(parenthese(s));
		System.out.println(liner(s));
		
		
	}

	private static String liner(String s) {
		// TODO Auto-generated method stub
		String result = "";
		for (String a : s.split(" ")) {
			if (result.equals("")) {
				result += oneliner(a);
			} else {
				result += " "+oneliner(a);
			}			
		}
		return result;
	}

	private static String oneliner(String a) {
		// TODO Auto-generated method stub
		String result = "";
		if (a.length() == 1) { 
			return a;
		}
		for (int i = 0; i < a.length(); i++) {
			if (result.equals("")) {
				result += a.toCharArray()[i];
			} else {
				result += "-" + a.toCharArray()[i];
			}
		}
		
		
		return result;
	}

	private static String parenthese(String s) {
		// TODO Auto-generated method stub
		String result = "";
		for (String a : s.split(" ")) {
			if (result.equals("")) {
				result += "("+a+")";
			} else {
				result += " ("+a+")";
			}
			
		} 
		
		return result;
	}

}
