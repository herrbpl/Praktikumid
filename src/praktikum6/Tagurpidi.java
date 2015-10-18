package praktikum6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import lib.TextIO;

public class Tagurpidi {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbreid = 10;
		ArrayList<Integer> numbrid = new ArrayList<Integer>();
		for (int i = 0; i < numbreid; i++) {
			System.out.format("Sisesta number %d", i);
			Integer n =TextIO.getlnInt();
			numbrid.add(n);						
		}
		System.out.println(numbrid.toString());
		Collections.reverse(numbrid);
		System.out.println(numbrid.toString());
	}

}
