package Praktikum;

import static jsTools.Graph.*;

public class Praktikum24 {

public static void main(String main [] ) {
	paint();	
}



public static void moveElement(int elNum, int toX, int toY){
	
	setPos(elNum,toX, toY);
	paintNew();
}


public static void paint() {
	
	int px=10,    	// x Position des Kreises     
		py=500,		// y-Position des Kreises
		kreis;		// Elementnummer des Kreises

	addRect(10,10,800,800,"grey");
	kreis=addCircleBorder(px,py,30,"white");

	for(int i = 0; i < 500; i++) {
	sleep(10); // 1000 Millisekunden warten = 1 sek
	px=px+2;
	moveElement(kreis, px, py);
	}
	

}


}
