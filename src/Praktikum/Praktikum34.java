package Praktikum;

import static jsTools.Input.*;
import static jsTools.Graph.*;

public class Praktikum34 {

	public static void main(String args [] ) {
		
		Auto auto1 = new Auto("Nasser", 10, 600, 0, 2019, readLine("Farbe-Rad: "), readLine("Farbe-Dach: "), readLine("Farbe-Karosse: ") ); 
		auto1.driveTo(readInt("Pos-X: "), readInt("Pos-Y: "));
		
		
		//Auto auto2 = new Auto("Nasser2", 0, 0, 0, 2019);
		//auto2.driveTo(15, 30);
		
		
		auto1.print();
		//auto2.print();
	
	}

	
}


class Auto {
		
	String hrst;
	int posX;
	int posY;
	double kmStand;
	int baujahr;
	String farbeRad;
	String farbeDach;
	String farbeKarosse;
		
	Auto (String h, int x, int y, double km, int bj, String fr, String fd, String fk){
		hrst = h;
		posX = x;
		posY = y;
		kmStand = km;
		baujahr = bj;
		farbeRad = fr;
		farbeDach = fd;
		farbeKarosse = fk;
		
	}
		
void init(String hst, int x, int y, int km, int bj) {
	hrst = hst;
	posX = x;
	posY = y;
	kmStand = km;
	baujahr = bj;
}
		
	/*void readValues() {
		String h = readLine("Hersteller: ");
		int x = readInt("X-Postition: ");
		int y = readInt("Y-Position: ");
		int km = readInt("Kilometerstand: ");
		int bj = readInt("Baujahr: ");
	}*/
		
void driveTo(int xNeu, int yNeu) {
		
	System.out.println("Vorher: " + posX + "   " + posY);
	System.out.println("Nachher: " + xNeu + "   " + yNeu);
			
	//Berechnung von a
	int a = 0;
	if(xNeu - posX > 0) {	a = xNeu - posX;   } else if (xNeu - posX < 0) { 	 a = ((xNeu - posX) *-1 );		}
	//Berechnung von b
	int b = 0;
	if(yNeu - posY > 0) {	b = yNeu - posY;   } else if (yNeu - posY < 0) { 	 b = ((yNeu - posY) *-1 );		}
	//Berechnung von c
	double c = 0;
	c = Math.sqrt( (a*a+b*b) );
			
	kmStand += c;
	
	
	int j = 0;
	for(int i = 0; i <= xNeu && j <= yNeu; i++) {
		j++;
		
		posX++;
		posY--;
		paint();
		sleep(10);
		clearWindow();
		
	}
	
}
		 
void print() {
	System.out.println(hrst + " " + posX + " " + posY + " " + kmStand + " " + baujahr);
}


void paint(){
	addRectBorder(posX+50, posY-70, 200, 70, farbeDach);
	addRectBorder(posX, posY, 300, 100, farbeKarosse );
	addCircle(posX+20,posY+80, 45, farbeRad);
	addCircle(posX+230, posY+80, 45, farbeRad);
}




		
}
	