package Hausaufgaben;

import static jsTools.Input.*;

public class Hausaufgabe27 {

public static void main(String main [] ) {
	
	String s = readLine("Text für Verschlüsselung: ");
	char tab [] [] = {	{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'},
					 	{'U', 'F', 'L', 'P', 'W', 'D', 'R', 'A', 'S', 'J', 'M', 'C', 'O', 'N', 'Q', 'Y', 'B', 'V', 'T', 'E', 'X', 'H', 'Z', 'K', 'G', 'I'}											
				     };

	
	System.out.println("Verschlüsselter Text: " + cryptText(s, tab) );
	System.out.println("Unverschlüsselter Text: " + decryptText(s, tab) );
	
}
	


public static char crypt(char c, char tab [] []) {
	
	for(int i = 0; i < tab[0].length; i++) {
		if(c == tab [0] [i]) {		return tab [1] [i]; 		}
	}
	
	return c;
}


public static char decrypt(char c, char tab [] []) {
	
	for(int i = 0; i < tab[1].length-1; i++) {
		if(c == tab [1] [i]) {		c = tab [0] [i];		}
	}
	
	return c;
}


public static String cryptText(String s, char tab [] []) {
	
	String sv = "";
	
	for(int i = 0; i < s.length(); i++) {
		sv = sv + crypt( s.charAt(i), tab );
	}

	return sv;
}


public static String decryptText(String s, char tab [] []) {
	
	String se = "";
	
	for(int i = 0; i < s.length(); i++) {
		se = se + decrypt( s.charAt(i), tab );
	}
	
	return se;
}
	


}
