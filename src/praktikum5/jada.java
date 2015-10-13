package praktikum5;

import java.lang.Thread.UncaughtExceptionHandler;
import java.security.InvalidParameterException;
import java.text.Format;

import lib.TextIO;


public class jada {

	
	
	public static void main(String[] args) {
		
		double[][] Mat = {{1, 2, 3}, {4,5,6}};
		double[][] Mat2 = {{7, 9, 11}, {8,10,12}};
		System.out.println(dump(Mat));
		System.out.println(dump(transpose(Mat2)));
		double[][] Result = dot(Mat, transpose(Mat2));
		
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
		ret += String.format("%d rows, %d columns\n", mat.length, mat[0].length);
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
		
		/**
		 * Maatriksi korrutamine
		 * 
		 * esimese maatriksi veerud, teise maatriksi read
		 */
		int Rows = mat.length; // rows of first matrix
		int Columns = mat2[0].length; // columns of second matrix
		
		if (Rows != Columns) {
			throw new InvalidParameterException(String.format("Rows of first matrix (%d) and columns of second (%d) does not match", Rows, Columns ));
		}
		
		double[Rows][Columns] Result;		
		String s = "";
		for (int row = 0; row < Rows; row++) {
			
			
			for (int col = 0; col < Columns; col++) {
				s = "";
				for (int acol = 0; acol < mat[0].length; acol++) {
					s += "+" + String.format("%f*%f", mat[row][acol], mat2[acol][col]);
					
					
				}
				System.out.println(s);
			}
			
		}
		
		return null;
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


}
