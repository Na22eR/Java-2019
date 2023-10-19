package Hausaufgaben;

import static jsTools.Input.*;

public class Hausaufgabe10 {
	
public static void main( String main [] ) {
		
	char form =readChar("Form wählen (Quadrat: q ||Dreieck: d ||Raute: r): ");
	if(form == 'q') {quadrat();}
	if(form == 'd') {dreieck();}
	if(form == 'r') {raute();}
	
}


public static void quadrat() {
	
	int kl = readInt("Kantenlaenge eingeben: ");
	int r = 0;
	int b = 0;

	
	//While Schleife für die Decke 
	while (r < kl) {
		System.out.print("*" + " ");
		r++;
	}
	r = 0;
	System.out.println(" ");
	
	
	//While Schleife für den Körper
	while (r < kl -2) {
			System.out.print("*");
			while (b < kl+kl-3) {
				System.out.print(" ");
				b++;
		}
		b = 0;
		System.out.println("*");
		r++;
	}
	r = 0;
	
	
	//While Schleife für den Boden
	if(kl > 1) {
	while (r < kl) {
		System.out.print("*" + " ");
		r++;
	}
	}	
}


public static void dreieck() {

	System.out.println(" ");
	int h = readInt("Hoehe eingeben: ");
	int b = 0;
	int zz = 2;
	int rmax = 2*h-4;
	int imax = 3;
	
	//Schleife für Spitze
	while(b < h*2-2) {
		System.out.print(" ");
		b++;
	}
	System.out.print("*");
	b = 0;
	System.out.println(" ");
	
	
	if(h ==1);
	
	if(h ==2) {
		System.out.print("*" + " " + "*" + " " + "*");
	}
	
	if(h > 2) {	

	//Die folgenden Schleifen sind für den "Rumpf" des Dreiecks abhängig von der Höhe.
	while(zz < h) {
		
		while(b < rmax) {
			System.out.print(" ");
			b++;
		}
		b = 0;
		rmax -= 2;
		System.out.print("*");
		
		
		while(b < imax) {
			System.out.print(" ");
			b++;
		}
		b = 0;
		imax += 4;
		System.out.println("*");

		
		zz++;
	}
	
	//Diese letzte Schleife dient um die letzte Zeile auszugeben
	System.out.print("*");
	while(b < h*2-2) {
		System.out.print(" " + "*");
		b++;
	}
}
}


public static void raute() {

	System.out.println(" ");
	int h = readInt("Kantenlaenge eingeben: ");
	int b = 0;
	int zz = 1;
	int rmax = 2*h-4;
	int imax = 3;
	
	//Schleife für Spitze
	while(b < h*2-2) {
		System.out.print(" ");
		b++;
	}
	System.out.print("*");
	b = 0;
	System.out.println(" ");
	
	
	//If Condition wegen h=1
	if(h == 1);

	//If Condition wegen h=2
	if(h == 2) {
		System.out.print("*");
		System.out.print(" " + " " + " ");
		System.out.println("*");
		System.out.print(" " + " " + "*");
	}
	
	//If Condition für h>2
	if(h > 2){	

	//Die folgenden Schleifen sind für den "Rumpf" des Dreiecks abhängig von der Höhe.
	while(zz < h) {
		
		while(b < rmax) {
			System.out.print(" ");
			b++;
		}
		b = 0;
		rmax -= 2;
		System.out.print("*");
		
		
		while(b < imax) {
			System.out.print(" ");
			b++;
		}
		b = 0;
		imax += 4;
		System.out.println("*");

		
		zz++;
	}
	b = 0;


	//Folgende Schleifen geben den unteren Rumpf der Raute aus 
	zz = 2;
	rmax = 2;
	imax = 3+(h-3)*4;
	while(zz < h) {
		
			while(b < rmax) {
				System.out.print(" ");
				b++;
			}
			b = 0;
			rmax += 2;
			System.out.print("*");
			
			
			while(b < imax) {
					System.out.print(" ");
					b++;
			}
			b = 0;
			imax -= 4;
			System.out.println("*");
			
		zz++;	
	}
	b = 0;
	 
	
	//Die letzte Schleife gibt die Untere Spitze aus
	while(b < h*2-2) {
		System.out.print(" ");
		b++;
	}
	System.out.print("*");
	b = 0;

	}
}
}
