package Praktikum;

//import static jsTools.Input.*;

public class Praktikum11 {

public static void main(String main []) {
	tabelle();
}

public static void tabelle() {

	int j = 1;
	int i;
	int z1 = 1;
	
	//Deko auﬂen rum
	System.out.println("Multiplikations-Tabelle: ");
	System.out.println("");
	System.out.println("__________________________________________________________________________________________");
	System.out.print("\t" + "|");
	for(z1 =1; z1<= 10; z1++) {
		System.out.print("\t" + z1);   }
	System.out.println("");
	System.out.println("\t" + "|");
	
	// Eigentliche Ausgabe der Zahlen
	while (j <= 10) {
	System.out.print(j + "\t" );
	System.out.print("|" + "\t" );
	
		for(i =1; i <= 10; i++){  
			System.out.print((j*i) + "\t");
		}

		System.out.println();
		j++;
	}
	

}


}
