package Hausaufgaben;

import static jsTools.Input.*;

public class Hausaufgabe05 {
	
public static void main( String [] args) {
	
	System.out.println("Hallo, um ein Datum in einen Wochentag umzuwandeln bitte folgende Daten eingeben: ");
	
	abfrage();
	
}	



public static void wiederh() {
	
	System.out.println(" ");
	
	char wdh = readChar("Möchten Sie fortfahren? J/N: ");
	System.out.println(" ");
	
	if(wdh == 'j' || wdh == 'J') {
		abfrage();
	}
	
	else if(wdh == 'n' || wdh == 'N') {
		
		System.out.println(" ");
		System.out.println("Vielen Dank für die Nutzung des Wochentag-Rechners :) ");
		System.exit(0);
	}
	
	else {
		System.out.println("Fehlerhafte Eingabe, bitte geben Sie j oder n ein. ");
		wiederh();
	}
	
}



public static void abfrage() {
	
	System.out.println(" ");
	int d =    readInt("Tag eingeben: ");
	
	if (d > 31 || d<0) {
		System.out.println("Fehlerhafte Eingabe, Tage sind mit den Zahlen 1-31 einzugeben ");
		abfrage();
	}
	
	int m =    readInt("Monat eingeben: ");
	if (m > 12 || m<0) {
		System.out.println("Fehlerhafte Eingabe, Monate sind mit den Zahlen 1-31 einzugeben");
		abfrage();
	}
	if (d > 28 && m == 2 ) {
		System.out.println("Fehlerhafte Eingabe, der Februar hat nur 28 Tage. ");
		abfrage();
	}
	
	int j =    readInt("Jahr eingeben: ");
	int n = 	m;
	int j2 = 	j;
	if  (m == 1 || m == 2) {
		 m += 12;	
		 j -= 1;
		 n = m - 12; 
	}
	int y =    (j%100);
	int c =    (j/100);
		
	System.out.println(" ");
	
	
	int w = ((d + ((26*(m+1))/10) + ((5*y)/4) + (c/4) + 5*c-1)%7);
	

	switch(w) {
	case 0: System.out.println("Der " + d + "." + n + "." + j2 + " ist ein Sonntag!");
	break;
	case 1: System.out.println("Der " + d + "." + n + "." + j2 + " ist ein Montag!");
	break;
	case 2: System.out.println("Der " + d + "." + n + "." + j2 + " ist ein Dienstag!");
	break;
	case 3: System.out.println("Der " + d + "." + n + "." + j2 + " ist ein Mittwoch!");
	break;
	case 4: System.out.println("Der " + d + "." + n + "." + j2 + " ist ein Donnerstag!");
	break;
	case 5: System.out.println("Der " + d + "." + n + "." + j2 + " ist ein Freitag!");
	break;
	case 6: System.out.println("Der " + d + "." + n + "." + j2 + " ist ein Samstag!");
	break;
	
	default: 	System.out.println("Fehlerhafte Eingabe, Werte müssen wiefolgt eingegeben werden: ");
				System.out.println("Tage von 1 bis 31");
				System.out.println("Monate von 1 bis 12");
				System.out.println("Jahre von 0 bis 9999");		
	}

	wiederh();
}

}

