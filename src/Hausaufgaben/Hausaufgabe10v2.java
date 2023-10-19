package Hausaufgaben;

import static jsTools.Input.*;

public class Hausaufgabe10v2 {

public static void main(String main []) {
	char form =readChar("Form wählen (Quadrat: q ||Dreieck: d ||Raute: r): ");
	int y = readInt("Größe bestimmen: ");
	if(form == 'q') {quadrat(y);}
	if(form == 'd') {dreieck(y);}
	if(form == 'r') {raute(y);}
	System.out.println();			
}
		
public static void spitze(int g){
		
	int b;
	for(b=0; b < g*2-2; b++) {
		System.out.print(" ");
	}
	System.out.print("*");	
	System.out.println(" ");
}


public static void rumpf(int g, int b, int rmax, int imax, int rmaxv, int imaxv, int start) {

	int zz;
	for(zz=start; zz < g; zz++) {
			
		for(b=0;b < rmax;b++) {
			System.out.print(" ");
		}
		rmax -= rmaxv;
		System.out.print("*");
			
			
		for(b=0;b < imax;b++) {
			System.out.print(" ");
		}
		imax -= imaxv;
		System.out.println("*");
	}
	
}


public static void zeilevoll(int g) {
		
	int r;
	for (r = 0; r < g; r++) {
		System.out.print("*" + " ");
	}
	System.out.println(" ");
}


public static void quadrat(int x) {
	if(x ==1){System.out.println("*");}
	else {
	zeilevoll(x);
	rumpf(x, 0, 0, (x+x-3), 0, 0, 2);
	zeilevoll(x);
	}
}


public static void dreieck(int x) {
	if(x==0) {}
	else if(x==1) {System.out.println("*");}
	else {
	spitze(x);
	rumpf(x, 0, (2*x-4), 3, 2, -4, 2);
	zeilevoll((x*2-1));
	}
}


public static void raute(int x) {
	if(x==0) {}
	else if(x==1) {System.out.print("*");}
	else {
	spitze(x);
	rumpf(x, 0, (2*x-4), 3, 2, -4, 2);
	rumpf(x, 0, 0, (7+(x-3)*4), -2, 4, 1);
	spitze(x);
	}
}

	
	
}
