package Hausaufgaben;

import static jsTools.Input.*;

public class Hausaufgabe09 {

public static void main( String main [] ) {
	
	int g = readInt("Grenze eingeben: ");
	int z = 1;
	int q;
	int sz = 0;
	int sq = 0;
	
	System.out.println(" ");
	System.out.print("Zahl:");
	System.out.print("\t" + "Quadrat:");
	System.out.print("\t" + "Summe der Zahlen:");
	System.out.print("\t" + "Summe der Quadratzahlen:");
	System.out.println(" ");
	
	while(z <= g) {
		
		System.out.print(z + "\t");
	
		System.out.print(z*z);
		
		sz = sz+z;
		System.out.print("\t" + "\t" + (sz));
			
		q = z*z;
		sq = sq+q;
		System.out.println("\t" + "\t" + "\t" + sq);
		
		z++;
		
	}
	
}



}
