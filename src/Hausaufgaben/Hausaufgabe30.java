package Hausaufgaben;

public class Hausaufgabe30 {
	
	/*
	  
	 
	Hausaufgabe besteht nur aus erklären
	
	Deklaration von Integer-Variable i & Initialisieren von i mit 2
	Dekleration der Double-Variable x & Initialisierung von x mit 11/2
	
	Neu Initialisierung von x für den Wert
	
		In Klammer: 
			Erst i-- + ++i ergibt: 2-- + ++2 ergibt: 1 + 3 = 4
			Dann: x / 4 ergit: (11/2) / 4 = 1,375
	
		Vor Klammer:
			5/2 - (1,375) ergibt: 2,5 - 1,375= 1,125
		
	x = 1,125

	
	Tabelle:
	
	Programm:  									Operation:													Variable:
	int i = 2;									Deklaration von i (int) Init mit Wert 2						i = 2
	double x = 11/2								Deklaration von x (double) 									x
				5								IntigerDivision von 11 / 2									
				5,0								Implizieter Cast von int zu double also von 5 -> 5,0
												Init von x mit Wert 5,0 									x = 5,00
	5/2											Intigerdivison von 5 / 2 
												Impliezieter Cast von int zu double also von 2 -> 2,0		 
	i--											nimmt wert 2 und zieht davon 1 ab							i = 1
												Implizieter Cast von int zu double 2 -> 2,0	
	x / i--										DoubleDivision 5,0 / 2,0 = 2,5				
						
	++i											zählt 1 zum Wert von i = 2									i = 2
												Implizieter Cast von int zu double 2 -> 2,0
	+ ++i										DoubleAddition 2,5 + 2,0 
	
												Implizieter Cast von int zu double 2 -> 2,0
												
	2,0 - 4,5									Double Subtraktion 2,0 -4,5						
	x = -2,5									Zuweisung von i für -2,5									x = -2,5
	
	
	*/
}
