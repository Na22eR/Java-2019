package Hausaufgaben;

//import static jsTools.Input.*;

public class Hausaufgabe33 {

public static void main(String args [] ) {
	
	Auto auto1 = new Auto("Nasser", 0, 0, 0, 2019); 
	Auto auto2 = new Auto("Nasser2", 0, 0, 0, 2019); 
	
	auto1.driveTo(10, 15);
	auto2.driveTo(15, 30);
	
	auto1.print();
	auto2.print();
}
	
}


class Auto {
	
	String hrst;
	int posX;
	int posY;
	double kmStand;
	int baujahr;
	
	Auto (String h, int x, int y, double km, int bj){
		hrst = h;
		posX = x;
		posY = y;
		kmStand = km;
		baujahr = bj;
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
	posX = xNeu;
	posY = yNeu;
}
	 
void print() {
	System.out.println(hrst + " " + posX + " " + posY + " " + kmStand + " " + baujahr);
}	
	
}














