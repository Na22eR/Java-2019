package Hausaufgaben;

import static jsTools.Input.*;

public class Hausaufgabe21 {

public static void main(String main [] ) {
		
	int n = readInt("Reichweite der Caesar-Verschl�sslung: ");
	char c = readChar("Einzelnen Character festlegen: ");
	String text = readLine("Text zur Verschl�sslung eingeben: ");
	System.out.println("");
	System.out.println("Verschl�sselter Char: " + charCrypt(c, n) );
	System.out.println("Entschl�sselter Char: " + charDeCrypt(charCrypt(c, n), n) );
	System.out.println(" ");
	System.out.println("Verschl�sselter Text: " + stringCrypt(text, n) );
	stringDeCrypt(text, n);
}



public static char charCrypt(char c, int n) {
		
	int entf = 0;
	char useless1 = c;
	for(c = useless1; c != 'a' && c != 'A'; c--) {
		entf++;
	}
	if(c >= 32 && c <= 63) { return c;}
	else if( (1 + n + entf) <= 26) {c = 'A';	c += n + entf;		} 		else {c = 'A';	c += n + entf - 26; }
		
	return c;
}


public static char charDeCrypt(char c, int n) {
		
	int entf2 = 0;
	char useless2 = c;
	for(c = useless2; c != 'a' && c != 'A'; c--) {
		entf2++;
	}
	if(c >= 32 && c <= 63) { return c;}
	if( (entf2 -n) < 0) {	c = 'A'; c += 26-n+entf2 ;		} 		else {	c -= n-entf2; }
	return c;
}


public static String stringCrypt(String s, int n) {
		
	String sv = "";
	int l = s.length();
	for(int i = 0; i < l; i++) {
		sv = sv + charCrypt( s.charAt(i), n);
	}
	
	
	return sv; 
}




public static void stringDeCrypt(String s, int n) {
		
	System.out.print("Entschl�sselter Text: ");
	int l = s.length();
	for(int i = 0; i < l; i++) {
		System.out.print(charDeCrypt(stringCrypt(s, n).charAt(i),n) );
	}
		
}	


}
