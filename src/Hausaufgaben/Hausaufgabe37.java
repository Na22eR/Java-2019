package Hausaufgaben;

import static jsTools.Input.*;

public class Hausaufgabe37 {
//class MainPerson
	
public static void main(String main [] ) {
		
	Personenkartei meineKartei = new Personenkartei ();
	
	int ausw;
	int exit = 0;;
	
	while(exit == 0) {
	Personenkartei.printMenu();
	ausw = readInt("Deine Auswahl: ");
	if(ausw == 1) 	   {	meineKartei.addNewPerson();	  	  }
	else if(ausw == 2) {	meineKartei.printKartei();     }
	else if(ausw == 3) {	meineKartei.searchPerson();	  }
	else if(ausw == 4) 	 {	exit = 1;    }
	else if(ausw != 1 && ausw != 2 && ausw != 3 && ausw != 4) {ausw = readInt("Erneute Eingabe des gewünschten Menu-Punkts: ");}
	}	
	
	System.out.println(Person02.anz); System.out.println(Personenkartei.kAnz);
		
}		
	
	

}

class Person02 {
	
	int pnr;
	String name;
	int zip;
	String ort;
	static int anz = 0;
	
	Person02() {
		anz++;
		pnr = anz;
		name = readLine("Name: ");
		zip = readInt("Postleitzahl: ");
		ort = readLine("Wohnort: ");
	}
	
	Person02 (int p, String n, int z, String o){
		pnr = p;
		name = n;
		zip = z;
		ort = o;
		
	}
	
	void printPerson() {
		System.out.print(pnr + "\t" + name + "\t" + zip + "\t" + ort);
	}
	
	void readPerson() {
		name = readLine("Name: ");
		zip = readInt("Postleitzahl: ");
		ort = readLine("Wohnort: ");
		
	}
	
	boolean isNr(int n) {
		if(pnr == n) {		return true; 		}
		else {		return false;	 }
	}
	
}


class Personenkartei {
	
	int kG;
	Person02 kartei []; 
	static int kAnz = 0;
	
	Personenkartei() {
		kG = 10;
		kAnz++;
		kartei = new Person02 [kG];
	}
	
	void addPerson(Person02 p) {
		for(int i = 0; i < kartei.length; i++) {
			if(kartei [i] == null) {	kartei[i] = p; break;	}
		}
		
	}
	
	void addNewPerson() {
		Person02 x = new Person02();
		
		for(int i = 0; i < kartei.length; i++) {
			if(kartei [i] == null) {	kartei[i] = x; break;		}
		}
		
	}
	
	void printKartei() {
		for(int i = 0; i < kartei.length; i++) {
			
			if(kartei[i] != null) {	 System.out.println(kartei[i].pnr + "\t" + kartei[i].name + "\t" + kartei[i].zip + "\t" + kartei[i].ort );	}
		}
	}
	
	void searchPerson(int n) {
		for(int i = 0; i < kartei.length; i++) {
			if(kartei[i] != null && kartei[i].pnr == n ) { System.out.println(kartei[i].pnr + "\t" + kartei[i].name + "\t" + kartei[i].zip  + "\t" + kartei[i].ort); }
		}
	}
	
	void searchPerson() {
		int search = readInt("Personennummer-Suche: ");
		for(int i = 0; i < kartei.length; i++) {
				if(kartei[i] != null &&kartei[i].pnr == search ) { System.out.println(kartei[i].pnr + "\t" + kartei[i].name + "\t" + kartei[i].zip  + "\t" + kartei[i].ort); }
			}	
	}
	
	static void printMenu() {
		System.out.println("Menue Optionen: ");
		System.out.println("1.Einfügen   2.Ausgabe der Kartei   3.Suchen nach Person via Nummer   4.Beenden");
	}
}