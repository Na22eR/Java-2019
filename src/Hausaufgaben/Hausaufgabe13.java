package Hausaufgaben;

import static jsTools.Wand.*; 

import static jsTools.Input.*;

public class Hausaufgabe13 {

public static void main(String main []) {
	
	initWand();
	String wahl = readLine("Form auswählen (Diagonale, GegenDiagonale, Vertiakle, Horizontale, Vertikale2, Horizontale2, Rechteck): "); 
	int speed = 100;
	int pause = 500;
	String color = readLine("Farbe eingeben: ");
	int spalte = readInt("Spalte: ");
	int zeile = readInt("Zeile: ");;
	int höhe = readInt("Höhe: ");;
	int breite = readInt("Breite: ");;
	if( wahl.equals("Diagonale")) 		{paintDiagonale(speed, color); }
	if( wahl.equals("GegenDiagonale")) 	{paintGegenDiagonale(speed, pause, color); }
	if( wahl.equals("Vertikale")) 		{paintVer(spalte, speed, color); }
	if( wahl.equals("Horizontale")) 	{paintHor(zeile, speed, color); }
	if( wahl.equals("Horizontale2")) 	{paintHor2(zeile, zeile, breite, speed, color); }
	if( wahl.equals("Vertikale2")) 		{paintVer2(spalte, zeile, breite ,speed, color); }
	if( wahl.equals("Rechteck")) 		{paintRe(zeile, spalte, breite, höhe ,speed, color); }
	
}

static void paintDiagonale(int speed, String color){
	
	for(int i =0; i <24; i ++){
		setWandColor (i, i, color) ;
		paintWandNew ( ) ;
		sleep (speed);
	}
	
}

static void paintGegenDiagonale(int speed, int pause, String color){
	
	for (int i =0; i <24; i ++){
		setWandColor(i, 23-i, color);
		paintWandNew ( ) ;
		sleep (speed);
		}

}

static void paintHor(int zeile, int speed, String color){
	
	for(int i = 0; i <24; i ++){
		setWandColor(zeile-1 , i , color) ;
		paintWandNew( );
		sleep (speed);
	}
	
}

static void paintVer(int spalte, int speed, String color){
	
	for(int i = 0; i <24; i ++){
		setWandColor( i , spalte-1 , color) ;
		paintWandNew( );
		sleep (speed);
	}
	
}

static void paintHor2(int zeile, int from, int lge, int speed, String color){
	
	for(int i = from-1; i <from+lge-1; i ++){
		setWandColor(zeile-1 , i , color) ;
		paintWandNew( );
		sleep (speed);
	}

}

static void paintVer2(int spalte, int from, int lge, int speed, String color){
	
	for(int i = from-1; i <from+lge-1; i ++){
		setWandColor( i , spalte-1 , color) ;
		paintWandNew( );
		sleep (speed);
	}
	
}

static void paintRe(int z0, int s0, int breite, int höhe, int speed, String color){
	
	for(int i = s0-1; i <s0+breite-1; i ++){
		setWandColor(z0-1 , i , color) ;
		paintWandNew( );
		sleep (speed);
	}
	
	for(int i = s0-1; i <s0+breite-1; i ++){
		setWandColor(z0-1+höhe-1, i , color) ;
		paintWandNew( );
		sleep (speed);
	}
	
	for(int i = z0-1; i <z0+höhe-1; i ++){
		setWandColor( i , s0-1 , color) ;
		paintWandNew( );
		sleep (speed);
	}
	
	for(int i = z0-1; i <z0+höhe-1; i ++){
		setWandColor( i , s0-1+breite-1 , color) ;
		paintWandNew( );
		sleep (speed);
	}
	
}


}
