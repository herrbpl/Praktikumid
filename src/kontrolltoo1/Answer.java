package kontrolltoo1;
public class Answer {

   public static void main (String[] args) {
      System.out.println (kuupideSumma (5., -5.));
      System.out.println (pos2k (0));
      System.out.println (pos2k (10));
      System.out.println (pos2k (11));
      System.out.println (pos2k (99));
      System.out.println (pos2k (100));

      System.out.println (nullideArv (new int[]{1}));
      System.out.println (nullideArv (new int[]{1,0,1}));
      System.out.println (nullideArv (new int[]{1,0,0,1}));
      System.out.println (nullideArv (new int[]{}));
      

      System.out.println (keskmisestParemaid (new double[]{0.}));
      System.out.println (keskmisestParemaid (new double[]{1., 2., 3.}));
      System.out.println (keskmisestParemaid (new double[]{1., 2., 2., 3.}));
      System.out.println (keskmisestParemaid (new double[]{-1., 1., 0.1, 0.2}));
      System.out.println (keskmisestParemaid (new double[]{}));
      // 

      // YOUR TESTS HERE
   }

   public static double kuupideSumma (double a, double b) {	  
      //return -1.;  // TODO!!! YOUR PROGRAM HERE
	  return a*a*a+b*b*b;
   }

   /**
    * Koostage Java-meetod, mis teeb kindlaks, kas etteantud täisarv n kuulub lõiku 10 kuni 99 (otspunktid kaasa arvatud). 
	* Write a method in Java to check whether a given integer number n belongs to closed interval from 10 to 99.
    * @param n
    * @return
    */
   public static boolean pos2k (int n) {
	      return (n >= 10 && n <= 99);
   }

   /**
    * Koostage Java-meetod, mis leiab etteantud täisarvude massiivi m nulliga võrduvate elementide arvu. 
	* Write a method in Java to find the number of zeros in a given array of integers m.
    * @param m
    * @return
    */
   public static int nullideArv (int[] m) {
	  int i = 0;
	  for (int j = 0; j < m.length; j++) {
		  if (m[j] == 0) {
			  i++;
		  }
	  }
      return i;  // YOUR PROGRAM HERE
   }
   
   /**
    * Koostage Java meetod, mis leiab etteantud reaalarvude massiivi d põhjal niisuguste elementide arvu, 
    * mis on rangelt suuremad kõigi elementide aritmeetilisest keskmisest 
    * (aritmeetiline keskmine = summa / elementide_arv). 
    * Write a method in Java to find the number of elements strictly greater than arithmetic mean 
    * of all elements of a given array of real numbers d (arithmetic mean = sum_of_elements / number_of_elements).
    * @param d
    * @return
    */
   public static int keskmisestParemaid (double[] d) {
	  double mean = 0.;
	  double sum = 0.;
	  
	  if (d.length == 0) {
		  return 0;
	  }
	  
	  for (int i = 0; i < d.length; i++) {
		 sum += d[i];
	  }
	   
	  mean = sum / (double)d.length;
	  
	  int result = 0;
	  
	  for (int i = 0; i < d.length; i++) {
		 if (d[i] > mean) {
			 result ++;
		 }
	  }
	  
      return result;  // YOUR PROGRAM HERE
   }

   
}
