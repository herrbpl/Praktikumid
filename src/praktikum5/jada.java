package praktikum5;

import java.lang.Thread.UncaughtExceptionHandler;
import java.text.Format;

import lib.TextIO;


public class jada {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int mitu=12;
//		jada('2', mitu);
//		String aa = askName();
	
		double[][] Mat = {
					{1, 2, 3}, 
					{4,5,6}
					};
		double[][] Mat2 = {
					{7, 9, 11}, 
					{8,10,12}
					};
		
		double[][] t = transpose(Mat);
		
		System.out.println(dump(Mat));
		System.out.println(dump(transpose(Mat)));
		
		double[][] Result = dot(Mat, transpose(Mat2));
		
//		double[][] Result1 = dot(100.0, Mat2);
//		
//		
//		double[][] Result = dot(Mat, Mat2);
//		System.out.println(Result1.length);
//		
//		
		String s = dump(Result);
		System.out.println(s);
		
	}

	
	private static double[][] transpose(double[][] mat) {
		// TODO Auto-generated method stub
		int w1 = mat.length;
		int h1 = mat[0].length;
		
		double[][] Result = new double[h1][w1];
		for (int i = 0; i < w1; i++) {
			for (int j = 0; j < h1; j++) {
				Result[j][i] = mat[i][j];
			}
		}
		
		return Result;
	}


	private static String dump(double[][] mat) {
		// TODO Auto-generated method stub
		String ret = "", comma="";
		for (int i = 0; i < mat.length; i++) {
			ret += "[";
			comma="";
			for (int j = 0; j < mat[i].length; j++) {
				ret += String.format("%s%f", comma, mat[i][j]);
				comma=",";
			}
			ret += "]\n";
		}
		return ret;
	}


	public static double[][] dot(double[][] m1, double[][] m2) {
        int m1ColLength = m1[0].length; // m1 columns length
        int m2RowLength = m2.length;    // m2 rows length
        if(m1ColLength != m2RowLength) return null; // matrix multiplication is not possible
        int mRRowLength = m1.length;    // m result rows length
        int mRColLength = m2[0].length; // m result columns length
        double[][] mResult = new double[mRRowLength][mRColLength];
        for(int i = 0; i < mRRowLength; i++) {         // rows from m1
            for(int j = 0; j < mRColLength; j++) {     // columns from m2
                for(int k = 0; k < m1ColLength; k++) { // columns from m1
                    mResult[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return mResult;
    }


	private static String dimensions(double[][] mat) {
		// TODO Auto-generated method stub
		String s = String.format("%d x %d", mat.length, mat[0].length);
		return s;
	}


	private static double[][] dot(double d, double[][] mat2) {
		// TODO Auto-generated method stub
		double[][] Result = mat2.clone();
		
		for (int i = 0; i < mat2.length; i++) {			
			for (int j = 0; j < mat2[i].length; j++) {
				Result[i][j]= d*mat2[i][j];
			}
		}
		
		return Result;
	}


	private static String askName() {
		// TODO Auto-generated method stub
		System.out.println("Enter Name: ");
		return TextIO.getlnString();
	}


	private static void jada(char c, int mitu) {
		// TODO Auto-generated method stub
		for (int i = 0; i < mitu; i++) {
			System.out.format("%s", c);
		}
		
	}
	
	

}
