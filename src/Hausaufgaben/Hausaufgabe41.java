package Hausaufgaben;

import static jsTools.Graph.*;

public class Hausaufgabe41 {

	static int x = 0;
	static int y = 0;
	static int d = 740;
	
public static void main(String args [] ) {
		smiley(x, y, d);
}
	
	static void smiley(int xPos, int yPos, int dr) {
		
		addCircleBorder(xPos, yPos, dr, yellow);
		addCircle(xPos + 3 * dr/8 - dr/8, yPos +dr/2 - dr/18, dr/2, red);
		addCircle(xPos+ 3 * dr/8 - dr/8, yPos + dr/2 - dr/10, dr/2, yellow);
		addCircleBorder(xPos + (3 * dr/8), yPos + dr/2 - dr/11, dr/4, red);
		
		if(dr >= 10) {
			links(xPos + dr/9, yPos + dr/9, dr/3 );}
		}
	
	static void links(int xPosL, int yPosL, int drL) {
		smiley(xPosL, yPosL, drL);
		rechts(xPosL + 4 * (drL/3), yPosL, drL);
	}
	
	static void rechts(int xPosR, int yPosR, int drR) {
		smiley(xPosR, yPosR, drR);
	}
	
}
