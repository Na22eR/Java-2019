package Praktikum;

public class Praktikum45 {

	static int sum(int p, int n, int k) {
		int summe = (k - p) * (k - p);
		
		if(p == n) { return summe; }
		else { return summe += sum(p+1, n ,k); }  
		
	}
	
	public static void main (String main [] ) {
		System.out.println( sum(1, 10, 10) ); 
		
		
	}
	
	
}
