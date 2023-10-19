package Hausaufgaben;

import static jsTools.Input.*;

public class Hausaufgabe21v2 {

	
public static void main(String main [] ) {
		
	int n = readInt("Reichweite der Caesar-Verschlüsslung: ");
	//char c = readChar("Einzelnen Character festlegen: ");
	String text = readLine("Text zur Verschlüsslung eingeben: ");
	System.out.println("");
	System.out.println("Verschlüsselter Text: " + stringCrypt(text, n) );
	stringDeCrypt(text, n);
}



public static char charCrypt(char c, int n) {
	
	if(c >= 97 && c <= 122) {c -= 0x20;}
	int ascii1 = (char) c;
	
	if(c >= 32 && c <= 63) { return c;}
	if( (n + ascii1) > 90) {	c -= (ascii1-65) +n-(ascii1+n-90+n-1);		} 		else {	c += n; }
			
	return c;
}


public static char charDeCrypt(char c, int n) {
			
	int ascii2 = (char) c;
	
	if(c >= 32 && c <= 63) { return c;}
	if( (ascii2 -n) < 65) {	c -= (ascii2-65) - 25 -(ascii2-65-n+1) ;		} 		else {	c -= n; }
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
			
	System.out.print("Entschlüsselter Text: ");
	int l = s.length();
	for(int i = 0; i < l; i++) {
		System.out.print(charDeCrypt(stringCrypt(s, n).charAt(i),n) );
	}
			
}		
	
	
}
