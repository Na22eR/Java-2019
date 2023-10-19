package Praktikum;

import static jsTools.Input.*;

public class Praktikum29 {

	int pnr;
	String name;
	int zip;
	String ort;
	
public static void main(String main [] ) {
	
	instanzen();
}


public static void instanzen() {
	
	Praktikum29 nr1;
	Praktikum29 nr2;
	nr1 = new Praktikum29();
	nr2 = new Praktikum29();
	
	nr1.pnr = readInt("1. Personennummer: ");
	nr1.name = readLine("1. Name: ");
	nr1.zip = readInt("1. Postleitzahl: ");  
	nr1.ort = readLine("1. Wohnort: ");
	
	nr2.pnr = readInt("2. Personennummer: ");
	nr2.name = readLine("2. Name: ");
	nr2.zip = readInt("2. Postleitzahl: ");
	nr2.ort = readLine("2. Wohnort: ");
	
	System.out.println("");
	System.out.println("1.Person: ");
	System.out.println("Personennummer: " + nr1.getPnr() ); 
	System.out.println("Name: " + nr1.getName() );
	System.out.println("PLZ: " + nr1.getZip() ); 
	System.out.println("Wohnort: " + nr1.getOrt() );
	
	System.out.println();
	System.out.println("2.Person: ");
	System.out.println("Personennummer: " + nr2.getPnr() );
	System.out.println("Name: " + nr2.getName() );
	System.out.println("PLZ: " + nr2.getZip() );
	System.out.println("Wohnort: " + nr2.getOrt() );
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
