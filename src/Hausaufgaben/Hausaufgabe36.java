package Hausaufgaben;

import static jsTools.Input.*;

public class Hausaufgabe36 {

public static void main(String main [] ) {

	int anz = readInt("Anzahl an Personen im Array: ");
	
	Personen arr [];
	arr = new Personen [anz];
	
	for(int i = 0; i < arr.length; i++) {
		arr [i] = new Personen(i, readLine("Name: "), readInt("PLZ: "), readLine("Wohnort: ") );
	}
	
	for(int j = 0; j < arr.length; j++) {
		arr[j].print();
	}
	
}

}



class Personen {
	
	int pnr;
	String name;
	int zip;
	String ort;
	
	Personen(int p, String n, int z, String o) {
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

void print() {
	System.out.println(pnr + "\t" + name + "\t" + zip + "\t" + ort);
}

boolean isNr(int n) {
	if(n == pnr ) {return true;} else {return false;}
}


}

