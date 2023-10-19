package Praktikum;

import static jsTools.Input.*;

public class Praktikum07 {

public static void main( String args [] ) {
	
	System.out.println("Um ein Datum auslesen zu lassen bitte folgende Werte eingeben. "); 
	System.out.println(" ");

	abfrage(); 
}


public static void abfrage() {
	
	
	int tag;
	//for (tag = readInt("Tag eingeben (1-31): "); tag > 31 || tag < 1; tag = readInt("Tag erneut eingeben: ")) {}
	do {tag = readInt("Tag eingeben: ");
	}while (tag < 1 || tag > 31);
	
	
	int monat;
	//for (monat = readInt("Monat eingeben (1-12): "); monat > 12 || monat < 1; monat = readInt("Monat erneut eingeben: ")){}
	do {monat = readInt("Monat eingeben: ");
	}while (monat < 1 || monat > 12);	
	
	if (monat == 2 && tag > 28) {
		System.out.println("Für den Monat 2 sind nur Werte von 1-28 gültig. Bitte Werte erneut eingeben.");
		//andernfalls mit GoTo zur DoWhile-Schleife
		for (tag = readInt("Tag eingeben (1-31): "); tag > 31 || tag < 1; tag = readInt("Tag erneut eingeben: ")) {}
		for (monat = readInt("Monat eingeben (1-12): "); monat > 12 || monat < 1; monat = readInt("Monat erneut eingeben: ")){}
	}
	if (monat == 4 || monat == 6 || monat == 9 || monat == 11 && tag > 30) {
		//andernfalls mit GoTo zur DoWhile-Schleife
		System.out.println("Für die Monate 4,6,9,11 sind nur Werte von 1-30 gültig. Bitte Werte erneut eingeben.");
		for (tag = readInt("Tag eingeben (1-31): "); tag > 31 || tag < 1; tag = readInt("Tag erneut eingeben: ")) {}
		for (monat = readInt("Monat eingeben (1-12): "); monat > 12 || monat < 1; monat = readInt("Monat erneut eingeben: ")){}
	}
	/*do {monat = readInt("Monat eingeben: ");
	}while (monat < 1 || monat > 12);
	if (monat == 2 && tag > 28) {
		
	}*/
	
	
	int jahr; 
	//for (jahr = readInt("Jahr eingeben (1900-2100): "); jahr > 2100 || jahr < 1900; jahr = readInt("Jahr erneut eingeben: ")) {}
	do {jahr = readInt("Jahr eingeben: ");
	}while (jahr < 1900 || jahr > 2100);	
	
	System.out.println(" ");
	System.out.println("Beim eingebenen Datum handelt es sich um den " + tag + "." + monat + "." + jahr);
}



}