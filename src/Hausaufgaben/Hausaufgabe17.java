package Hausaufgaben;

import static jsTools.Input.*;

public class Hausaufgabe17 {

public static void main(String main []) {
	
	int grenze = readInt("Obergrenze: ");
	Teilerv1(grenze);
	Teilerv2(grenze);
	//Primzahlen(grenze);
	
}



public static void Teilerv1(int i) {
	
	System.out.println("Teiler von " + i + ": ");		System.out.println("");
	int absatz = 0;
	for(int j = 1; j < i; j++) {
		if((i%j) == 0) {		System.out.print(j + "\t");			}
		if((i%j) == 0 ){ absatz++;} 	if(absatz == 5) {System.out.println(""); absatz = 0;}
	}
	System.out.println("");		System.out.println("-----------------------------------");
}

public static void Teilerv2(int g) {
	
	System.out.println("");	 	System.out.println("Primfaktoren von " + g + ": ");
	int pfl = g;
	int i = g;
	int t;
	for(t = 1; t < i; t++) {
		
		//Gibt Teiler aus	
		if((i%t) == 0) {	
		
			//Wenn pfl = 0, dann exit
			if(pfl == 0) {break;}
			
			//Überprüfung ob Primzahl
			//while((t%p) != 0 || t ==2) {       
			//p++;
		
			//Wenn Primzahl, dann pfl / pz
			if(t == 1) {} 	else if((pfl%t) == 0) {		pfl = pfl/t; System.out.print(t + "\t"); t--;			}  				
		}

	}
	
}
		


}