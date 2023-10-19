package Hausaufgaben;

public class Hausaufgabe16 {

public static void main(String main[]) {
	
	Primzahlen();
	
}


public static void Primzahlen() {
	
	int j;
	int i = 2;
	
	while(i <= 1000){
	j=2;
		while((i%j) != 0 || i == 2) {
			j++;
			if(j == i) 	{		System.out.print(i + "\t");			}
			if(i == 2)	{		System.out.print(i + "\t");	break;		}
		}
		
		i++;
	}
	
}


}
