package Hausaufgaben;

import static jsTools.Input.*;

public class Hausaufgabe20 {

public static void main(String main [] ) {
		
	System.out.println("IBAN-Generatorv1");
	long blz = 10012002L;
	long knr = 4646828279L;
	char LK1 = readChar("1. Buchstabe der Landkennung: ");
	char LK2 = readChar("2. Buchstabe der Landkennung: ");
	long pz =  Prüfziffer(blz, knr, LK1, LK2);
	System.out.println(IBAN(blz, knr, LK1, LK2, pz));
}




public static long BBAN(long blz, long knr) {
		
	blz *= 10000000000L;
	long BBAN = blz+knr;
	return BBAN;
}


public static long LandKennung(char LK1, char LK2) {
		
	int lk1i = 1;
	char Wert1=LK1; 
	for(LK1=Wert1; LK1 != 'A' && LK1 != 'a'; LK1 -= 1) {
		lk1i++;
	}
		
	int lk2i = 1;
	char Wert2=LK2;
	for(LK2=Wert2; LK2 != 'A' && LK2 != 'a'; LK2 -= 1) {
		lk2i++;
	}
	
	lk1i +=9;
	lk2i +=9;
		
	long LK = (lk1i*100)+lk2i; 

	return LK;		
}


public static long Prüfziffer(long blz, long knr, char LK1, char LK2) {
		
	long BBAN= (BBAN(blz, knr)%97)*1000000;
	long LK= LandKennung(LK1, LK2)*100;
	long pz = 98 - (BBAN+LK)%97;
		
	return pz;
}


public static String IBAN(long blz, long knr, char LK1, char LK2, long pz) {
		
	String blzS= "" + blz, knrS= "" + knr, LK1S= "" + LK1, LK2S= "" + LK2, pzS = "" + pz;
	String IBAN = LK1S + LK2S + pzS + " " + blzS + " " + knrS;
				
	if(pz<10) {		IBAN = LK1S + LK2S + 0 + pzS + " " + blzS + " " + knrS;		}

	return IBAN;	
}

	
	
}
