package Hausaufgaben;

import static jsTools.Input.readInt;
import static jsTools.Input.readLine;

public class Hausaufgabe46 {

	public static void main (String main [] ) {
	
	
	
	}

}

class LiElem {
	
	int pnr;
	String name;
	int zip;
	String ort;
	LiElem next;
	static int anz = 0;
	
	LiElem() {
		anz++;
		pnr = anz;
		name = readLine("Name: ");
		zip = readInt("Postleitzahl: ");
		ort = readLine("Wohnort: ");
		next = null;
	}
	
	LiElem(int p, String n, int z, String o){
		anz++;
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

class Liste {
	
	LiElem kopf;
	
	
	void insertBegin() {
		
		LiElem iB = new LiElem();
		iB.next = kopf;
		kopf = iB;
		
	}
	
	void insertEnd() {
		
		LiElem iE = new LiElem();
		
		if(kopf == null) { iE = kopf; }		
		else {
			
			LiElem pointer = kopf;
			
			while (pointer.next != null ) { pointer = pointer.next ; } 
			
			pointer.next = iE;
			
		}
		
	}
	
	void insertIterativ() {
		
		LiElem iI = new LiElem();
		LiElem pointer = kopf;
		
		while(pointer.next.pnr < iI.pnr) { pointer = pointer.next; }		//Vergleichskriterium bei Personen?
		
		iI.next = pointer.next.next; pointer.next = iI; 
		
	}
	
	void insertRekursiv(LiElem pointer) {
		
		LiElem iR = new LiElem();
		pointer = kopf;
	
		if(pointer.next.pnr < iR.pnr) { insertRekursiv(pointer.next); }		//Vergleichskriterium bei Personen?
		else { iR.next = pointer.next.next; pointer.next = iR; }											 
		
	}
	
	void print() {
		
		LiElem pointer = kopf;
		kopf.printPerson();
		
		while (pointer.next != null ) { 
			pointer.next.printPerson();
			pointer = pointer.next ; 
		} 
		
	}
	
}