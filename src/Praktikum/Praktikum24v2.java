package Praktikum;

import static jsTools.Graph.*;


public class Praktikum24v2 {

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

	addRect(10,10,980,720,"lightGray");
	kreis=addCircleBorder(px,py,50,"red");

	while(px < 980-41) {
		
		sleep(10); 
		px=px+2;
		moveElement(kreis, px, py);
	}
	
	sleep(500);
	
	
while(px > 10) {
		
		sleep(10); 
		px=px-2;
		if(py > 680 )	{ py -= 2;} else if(py <= 680)	{ py +=2; }
		moveElement(kreis, px, py);
	}
	

}
	
	
}
