package Praktikum;

import static jsTools.Graph.*;

public class Praktikum43 {

	public static void main(String main [] ) {
		addRect(0, 0, 740, 740, lightGray);
		//drawObjectV1(0, 0, 740, white);
		drawObjectV2(0, 0, 740, white);
		
	}
	
	
	
	
	static void drawObjectV1(int xPos, int yPos, int d, String clr) {
		drawObjectV1p1(xPos, yPos, d);
	}
	
	static void drawObjectV1p1(int xPos, int yPos, int d){
		addCircleBorder(xPos, yPos, d, white);
		if(d > 20) { 
			drawObjectV1p2(xPos, yPos + d/5 + d/25, d/2);
		}
			
	}
	
	static void drawObjectV1p2(int xPos, int yPos, int d) {
		addCircleBorder(xPos, yPos, d, blue);
		if(d > 20) { 
			drawObjectV1p1(xPos, yPos + d/5 + d/25, d/2);
		}
		
	}
	
	
	
	
	static void drawObjectV2(int xPos, int yPos, int d, String clr) {
		
		addCircleBorder(xPos, yPos, d, white);
		drawObjectL(xPos, yPos, d);
		drawObjectR(xPos, yPos, d);
		
	}
	
	static void drawObjectL(int xPos, int yPos, int d) {
		addCircleBorder(xPos, yPos + d/4, d/2, blue );
		
		if(d > 100) { 
			drawObjectV2(xPos, yPos + d/3 + d/21, d/4, white);   
			drawObjectV2(xPos + d/4, yPos + d/3 + d/21, d/4, white); 
		}
	}
	
	static void drawObjectR(int xPos, int yPos, int d) {
		addCircleBorder(xPos + d/2, yPos + d/4, d/2, blue);
		
		if(d > 100) { 
			drawObjectV2(xPos + d/2, yPos + d/3 + d/21, d/4, white);   
			drawObjectV2(xPos + d/2 + d/4, yPos + d/3 + d/21, d/4, white); 
		}
	}	
	
	
	
}
