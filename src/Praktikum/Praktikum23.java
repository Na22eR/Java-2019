package Praktikum;

import static jsTools.Input.*;

import static jsTools.Graph.*;

public class Praktikum23 {

public static void main(String main [] ) {
	
	int xR1, yR1,	//Pos linke obere Ecke 
		lR1, hR1;	//L�nge ist X-Ausdehnung, H�he ist Y-Ausdehnung
	String color = readLine("Farbe w�hlen: ");
	xR1 = readInt("Linke obere Ecke: X-Wert ");
	yR1 = readInt("Linke obere Ecke: Y-Wert ");
	lR1 = readInt("L�nge: ");
	hR1 = readInt("H�he: ");
	
	rechtEck(xR1, yR1, lR1, hR1, color);
}


public static void rechtEck(int xR1, int yR1, int lR1, int hR1, String color) {
	addRect(xR1, yR1, lR1, hR1, color);
}


}
