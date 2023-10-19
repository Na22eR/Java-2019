package Hausaufgaben;

public class Hausaufgabe26 {

	static final int n = 10;
	
public static void main(String main [] ) {
	
	System.out.println("Hausaufgabe 26: ");
	matrix();
}


public static void matrix() {
	
	long mtrx [] [] = new long [n] [n];
	
	for(int i = 0; i < mtrx.length; i++) {
		mtrx [i] [0] = 1;
	}
	for(int i = 0; i < mtrx.length; i++) {
		mtrx [0] [i] = 1;
	}
	
	
	
	for(int i = 1; i < mtrx.length; i++) {
		for(int j = 1; j < mtrx.length; j++) {
			mtrx [i] [j] = mtrx[i-1] [j] + mtrx[i] [j-1];
		}
		
		
	}

	
	for(int i =0; i < mtrx.length; i++) {
		for(int j= 0; j <mtrx[i].length; j++){
			System.out.print(mtrx [i] [j] +"\t");
		}
		System.out.println("");
	}
	
	
	
	
}




}
