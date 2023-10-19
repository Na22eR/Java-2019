package Hausaufgaben;

import static jsTools.Input.*;

public class Hausaufgabe32 {
	
	static final int anz = readInt("Anzahl an Personen: ");
	
public static void main(String args [] ) {
	create();
}

public static  void create() {
		
	Person arr [] = new Person[anz];
		
	for(int i =0; i < anz; i++) {
		
		arr [i] = new Person( readInt("Perosnalnummer: "), readLine("Name: "), readInt("ZIP: "),readLine("Ort;") ) ;
	}
			
	for(int i =0; i < anz; i++) {
			
		System.out.println(arr[i].getPnr() + arr[i].getName() + arr[i].getZip() + arr[i].getOrt() );
	}
		
	int j = 0;
	int k;
	while(j == 0) {
			
		k = readInt("Prüf-Nummer: ");
			
		if(k == -1) {	break;	  }
			
		for(int i =0; i < anz; i++) {
			if (arr[i].getPnr() == k) {	arr[i].print();	break; }
		}
		
		if(k == -1) {	 break;	   }
	}
	
}	
	
}





class Person {
	
	int pnr;
	String name;
	int zip;
	String ort;
	
	Person(int p, String n, int z, String o){
		pnr = p;
		name = n;
		zip = z;
		ort = o;
	}
	
	
int getPnr() {
	return pnr;	
}

String getName() {
	return name;
}
int getZip() {
	return zip;
}
String getOrt() {
	return ort;
}

void read() {
	int pnrR = readInt("Personalnummer: "); pnr = pnrR;
	String nameR = readLine("Name: ");		name = nameR;
	int zipR = readInt("Postleitzahl: ");	zip = zipR;
	String ortR = readLine("Ort: ");		ort = ortR;
}

void print() {
	System.out.println(pnr + name + zip + ort);
}

boolean isNr(int n) {
	if(n == pnr ) {return true;} else {return false;}
}
	

		
}
