package Hausaufgaben;

public class Hausaufgabe39 {

	
	static double B(double a, int n) {
		if (n == 0) { return 1; }
		else {return (a * B(a ,n-1) ) / (a * B(a ,n-1) + n ); }
		
	}
	
	public static void main(String args [] ) {
		System.out.println( B(30, 10) );
	}
	
}