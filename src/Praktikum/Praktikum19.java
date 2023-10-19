package Praktikum;

public class Praktikum19 {

public static void main(String main [] ) {
	
	System.out.println("Primzahlen von 1-1000:");
	Primzahlen();
	
}


public static void Primzahlen() {
	
	int tabz = 0;
	int anzahl = 0;
	String tab = "\t";
	String absatz = " ";
	String strich = "------------------------------------";
	String strichvoll = "____________________________________";
	String AnzahlPz = "Anzahl der Primzahlen";
	for(int i =2; i <= 1000; i++){
		if(PrimzahlPrüfer(i) == 1) 	{	Sop(tab, i); tabz++; anzahl++; 	}
		if(PrimzahlPrüfer(i) == 0)	{}
		if(tabz == 5)				{	tabz = 0; Sop(absatz, 0); Sop(strich, 0);		}	
	}
	
	Sop(absatz, 0);
	Sop(strichvoll, 0);
	Sop(AnzahlPz, anzahl);
	
}
	

public static int PrimzahlPrüfer(int pz){
	
	for(int j = 2; (pz%j) != 0 || pz == 2;) {
		j++;
		if(pz == j) 	{	return 1;	}
		if(pz == 2)		{	return 1; 	}
	}
	return 0;
	
}


public static void Sop(String y, int x) { 	
	if( x == 0) { 	System.out.print(y);	}
	if( x != 0) {	System.out.print(y + x); }
	if(y == " ") {	System.out.println(y);	}
}

}
