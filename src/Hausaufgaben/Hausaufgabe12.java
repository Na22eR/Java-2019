package Hausaufgaben;

import static jsTools.Input.*;

public class Hausaufgabe12 {

	
public static void main(String main []) {
	
	System.out.println("Taschenrechner v1");
	int a = readInt("Zahl für a eingeben: ");
	int b = readInt("Zahl für b eingeben: ");
	System.out.println();
	CalcAndPrint(a,b);
	
}
	

public static void CalcAndPrint(int a, int b) {
	
	//Summe: 
	System.out.println("Die Summe ist: " + (a+b));
	
	//Differenz:
	System.out.println("Die Differenz ist: " + (a-b));
	
	//Produkt: 
	System.out.println("Das Produkt ist: " + (a*b));
	
	//Quotient:
	System.out.println("Der Quotient ist: " + (a/b));	
	
}

}