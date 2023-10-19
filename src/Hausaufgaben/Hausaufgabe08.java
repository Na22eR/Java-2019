package Hausaufgaben;

import static jsTools.Input.*;

public class Hausaufgabe08 {

public static void main( String main [] ) {
	
	int z = readInt("Zahl eingeben: ");
	int i = 1;
	while (z <= 0) {z = readInt("Zahl erneut eingeben: ");}
	while (z > 1) {
		i = i*z;
		z = z-1;
	}
	
	System.out.println(i);

}
	
}
