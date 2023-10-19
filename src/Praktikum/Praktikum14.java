package Praktikum;

import static jsTools.Input.*;
import static jsTools.Wand.initWand;
import static jsTools.Wand.paintWandNew;
import static jsTools.Wand.setWandColor;

public class Praktikum14 {
	
public static void main(String main []){
		
	initWand();
	String wahl = readLine("Form auswählen (Diagonale2, GegenDiagonale2, Raute, Kreuz): "); 
	int speed = 0;
	String color = readLine("Farbe eingeben: ");
	int spalte = readInt("Spalte: ");
	int zeile = readInt("Zeile: ");;
	int laenge = readInt("Länge: ");	
	if( wahl.equals("Diagonale2")) 		{paintDiagonale2(spalte, zeile, laenge, color); }
	if( wahl.equals("GegenDiagonale2")) {paintGegenDiagonale2(spalte, zeile, laenge, color); }
	if( wahl.equals("Kreuz")) 			{paintKreuz(spalte, zeile, laenge, speed, color); }
	if( wahl.equals("Raute")) 			{paintRaute(spalte, zeile, laenge, speed, color); }

}
//Methode um eine Diagonale zu zeichnen
public static void paintDiagonale2(int spalte, int zeile, int laenge, String color){
		
	for(int i =spalte-1; i < spalte+laenge-1; i ++){
		setWandColor (zeile-1, i, color) ;
		paintWandNew ( ) ;
		zeile +=1;
	}
	
}
//Methode um eine GegenDiagonale zu zeichnen
public static void paintGegenDiagonale2(int spalte, int zeile, int laenge, String color) {
		
	int help = spalte;
	for(int i = spalte-1; i < spalte+laenge-1; i++){
		setWandColor(zeile-1, help-1, color);
		paintWandNew ( ) ;
		zeile += 1;
		help -=1;
	}
		
}
//Methode für das Kreuz
public static void paintKreuz(int spalte, int zeile, int laenge, int speed, String color) {
	
	int spaltem = spalte;
	int zeilem= zeile;
	int laengem = laenge; 
	int spalteAddLaenge = spalte + laenge-1;
	String colorm = color;
		
	paintDiagonale2(spaltem, zeilem, laengem, colorm);
	paintGegenDiagonale2(spalteAddLaenge, zeilem, laengem, colorm);
		
}
//Methode für Raute
public static void paintRaute(int spalte, int zeile, int laenge, int speed, String color) {
		
	int spaltem = spalte;
	int zeilem= zeile;
	int laengem = laenge; 
	int zeileAddLaenge = zeile + laenge-1;
	int spalteAddLaenge = spalte + laenge-1;
	int spalteSubLaenge = spalte - laenge+1;
	String colorm = color;
		
	paintDiagonale2(spaltem, zeilem, laengem, colorm);
	paintGegenDiagonale2(spaltem, zeilem, laengem, colorm);
	paintDiagonale2(spalteSubLaenge, zeileAddLaenge, laengem, colorm);
	paintGegenDiagonale2(spalteAddLaenge, zeileAddLaenge, laengem, colorm);
	
}


}
