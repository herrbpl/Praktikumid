package praktikum2;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.*;


public class Praktikum2 {

	static final double YEAR = (1000.0*60.0*60.0*24.0*365.0);
	
	static void ylesanne1( String nimi, int vanus, int kinganumber) {
		System.out.format("Mina olen %s, mu vanus on %d ja kinganumber on %d\n", nimi, vanus, kinganumber);
		
	}
	
	static int vanus(String birth) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
		try {

			Date d0 = formatter.parse(birth);
			Date d1 = new Date();			
	        						
			return (int)( (d1.getTime() - d0.getTime())  / (YEAR) );
						

		} catch (ParseException e) {
			e.printStackTrace();
		}

		return 0;
	}
	
	
	public static void main(String[] args) {
		
		Replace.main(args);
		// TODO Auto-generated method stub
		
		ylesanne1("Siim", vanus("1980-04-03"), 10);
		
		// ylesanne2.lahenda();
		
		// GroupFit.Solve();
		
		
		
	}

	
	
}
