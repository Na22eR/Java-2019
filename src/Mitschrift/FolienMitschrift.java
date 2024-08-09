package Mitschrift;

import static jsTools.Input.*;

public class FolienMitschrift {

	String autor;		//Variablen für Folie 82
	String text;		
	int laenge;
	int x;
	
public static void main(String main [] ) {

	//Folie47v2();
	//Folie49v2();
	//Folie62();
	//Folie67();
	//Folie72();
	//Folie82();
	System.out.println(rekursiveMethode(5));
	
}
	

//-------------------------------------------------------------------------------------------------------------------------------------------------------
static int Folie47(int a, int b) {
	if(b==0) {return 999999;}
	return a/b;
}

//-------------------------------------------------------------------------------------------------------------------------------------------------------
public static void Folie47v2() {
	int x=Folie47(readInt("Dividend festlegen: "),readInt("Divisor festlegen: "));
	System.out.println(x);
}

//-------------------------------------------------------------------------------------------------------------------------------------------------------
public static void Folie49(String txt, int i) {
	System.out.println(txt);
	System.out.println(i);
}

//-------------------------------------------------------------------------------------------------------------------------------------------------------
public static void Folie49v2() {
	//Methodenaufruf mit Übergabewerten
	String scörö = "hi";
	int k = 0;
	Folie49(scörö, k);
}

//-------------------------------------------------------------------------------------------------------------------------------------------------------
public static void Folie62() {
	//char shift von C zu c
	char test = readChar("Char festlegen: ");
	if(test == 'c') {}
	else { test += 0x20; }
	System.out.print(test);
}

//-------------------------------------------------------------------------------------------------------------------------------------------------------
public static void Folie67() {
	//cast von double auf int
	double e = 2.7415687;
	int i = (int) e;
	System.out.println(i);
	
	//cast von char auf int (Nimmt den Wert des Chars aus der ASCII Tabelle)
	char x = 'A';
	int b = (char) x;
	System.out.print(b);
	
}

//-------------------------------------------------------------------------------------------------------------------------------------------------------
public static void Folie72() {
	
	int scur [	]; 	// Integer-Variable als Arrays deklarierit
	scur = new int [3];		// Größe des Arrays
	scur [0] = 0;
	scur [1] = 1;
	scur [2] = 3;
	
	for(int i = 0; i < scur.length; i++) {
		System.out.println( scur [i] );
	}
	
	int scur2 [  ] = scur;	// Ein zweites Arrays das sich auf das erste bezieht 
	System.out.println(scur2 [2]);	// Ausgabe der Speicherzelle des 1. Arrays
	scur2 [2] = 4; 	//Ändern der Wertes der Speicherzelle [2] die sich auf das erste Arrays bezieht
	System.out.println(scur [2]); 	// Nun wird der bei scur2 für [2] definierte Wert ausgegeben
}

//-------------------------------------------------------------------------------------------------------------------------------------------------------
public static void Folie74() {
	double matrx [] [];										//0		1		2
	matrx = new double [4] [3];							//0					7.1
	matrx [0] [2] = 7.1;								//1			
														//2
														//3
														//4
	
	int n = 3; int m = 5; 	int a [] [] = new int [n] []; // Deklaratioen 2er Variablen und eines 2 dimensionalen Arrays
	
	for( int i = 0; i < a.length; i++) {
		a [i] = new int [m];			// Für die Spalte i also 0 bis 3 wird nurn jeder zeile m Spalten also 5 hinzugefügt
	}
	
	
	
	double b [] [] = {	{ 0, 1, 2, 3, 4},			// Initialisert das Array
						{ 5, 6, 7, 8, 9},
						{ 10, 11, 12, 13, 14}
					};
	
	for (int i = 0; i < b.length; i ++) {			// Gibt das Array aus 
		for (int j = 0; j < b[ i ].length; j ++) { 
			System.out.print(a [ i ] [ j ] + "\t " ) ; 
		System.out.println () ; }
		} 
	
}

//-------------------------------------------------------------------------------------------------------------------------------------------------------
public static void Folie82() {
	
	//FolienMitschrift d;
	//d = new FolienMitschrift(); 
	//d.text="blabla";					//initialisieren der String Varibale Text für das Obejkt d
	//System.out.println(d.getText() );	//Aufruf von getText, der die String Variable für d ausgibt.
	//d.addText("Hallo"); 				//Hinzufügen eines weiteren Strings zum Text
	//System.out.println(d.getText() );
	
	
}
public void addText(String txt) {
	text = text + txt;
	laenge = text.length();
}
public String getText() {
	return text;
}

//-------------------------------------------------------------------------------------------------------------------------------------------------------
public static void Folie96() {
	//static int -> bedeutet, dass jedes Object die selbe Speicherzelle hat
	//int -> nur int bedeutet, dass dieses Attribut für jedes Object eine eigene Speicherzelle hat
}

//-------------------------------------------------------------------------------------------------------------------------------------------------------
void Folie98() {
	//Auf dieser Folie wird das Object bzw Instanz s = s1 gesetezt -> dh. s referenziert auf den selben Speicherplatz wie s1 !! Kein neuer Speicherplatz
	//Beim der Abfrage s == s1 wird die Referenz geprüft, dh. -> referenzieren die beiden Instanzen auf das selbe Slot
}

//-------------------------------------------------------------------------------------------------------------------------------------------------------
static class Folie102{
	static String x;			//Variable unabhängig von der initialisierung daher Klassen Varialbe
	int Instanzvariable;	//Variable abhänhig von der initialisierung der Klasse daher Instanz Variable
}

//-------------------------------------------------------------------------------------------------------------------------------------------------------
void thisReferenz(int x) {
	//This Referenz falls Instanzvariable auch x heißt kann man mit der This Referenz auf die Instanzvariable zugreifen
	x = 5; //lokal Variable
	this.x = 5; // Instanz oder Klassen Variable
}
 	
//-------------------------------------------------------------------------------------------------------------------------------------------------------
static int rekursiveMethode(int n){
	if(n <= 0) { return 1; }
	else return rekursiveMethode(n-1) + rekursiveMethode(n-2);
}

//-------------------------------------------------------------------------------------------------------------------------------------------------------
static class einfachVerketteteListe{
	
}




}