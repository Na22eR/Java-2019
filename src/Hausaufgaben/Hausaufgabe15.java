package Hausaufgaben;

import static jsTools.Input.*;

public class Hausaufgabe15 {

public static void main(String main []) {
	
	int start = readInt("Startwert: ");
	int ende = readInt("Endwert: ");
	int sprung = readInt("Differenz der Werte: ");
	System.out.print(Ausgabe(start, ende, sprung));
	
}
	

public static int Ausgabe(int start, int ende, int sprung) {
	
	int i;
	int zz = -1;
	for(i = start; i <= ende; i+= sprung) {
		zz++;
	}
	
	return zz;
}

}
