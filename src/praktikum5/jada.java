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
	
		double[][] Mat = {{0.2, 0.3, 0.4}, {0.5,0.3,0.2}};
		double[][] Mat2 = {{0.2, 0.3, 0.4}, {0.5,0.3,0.2}};
		
		double[][] t = transpose(Mat);
		
		System.out.println(dump(Mat));
		System.out.println(dump(transpose(Mat)));
		
		double[][] Result = dot(transpose(Mat), Mat2);
		
//		double[][] Result1 = dot(100.0, Mat2);
//		
//		
//		double[][] Result = dot(Mat, Mat2);
//		System.out.println(Result1.length);
//		
//		
//		String s = dump(Result1);
//		System.out.println(s);
		
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


	private static double[][] dot(double[][] mat, double[][] mat2) {
		// TODO Auto-generated method stub
		int w1 = mat.length;
		int h1 = mat2[0].length;
		
		int w2 = mat[0].length;
		int h2 = mat2.length;
		
		
		if (w1 != h1) {
			throw new IllegalArgumentException("Matrix1 x must be of same as Matrix2 y");				
		}
		System.out.format("%d x %d\n", w1, h1);
		double[][] Result = new double[w2][h2];
		//Result.length = mat.length;
		
		
		
		return Result;
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
