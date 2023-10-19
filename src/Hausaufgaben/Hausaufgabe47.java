package Hausaufgaben;

public class Hausaufgabe47 {

public static void main( String main [] ) {
	System.out.println( e(2) );
	
}
	
	
static double e(int n) {
	
	if( n == 0) { return 1; }
	else {
	return (1 / fak(n) ) + e(n-1) ;	
	}
	
}
	
static double fak(int x) {
	double fak = 1;
	
	for(int i = x; i > 0; i--) {
		fak = fak * i;
	}
	
	return fak;
}
	
}
