package Praktikum;

public class Praktikum22 {

public static void main(String main [] ) {
	
	array();
	
	
	
}
	

public static void array() {
	
	int arr [] = new int [10];
		arr [0] = 0;  
		arr [1] = 1; 
		arr [2] = 2;
		arr [3] = 3; 
		arr [4] = 4; 
		arr [5] = 5; 
		arr [6] = 6; 
		arr [7] = 7;
		arr [8] = 8; 
		arr [9] = 9; 
	
	for(int i = 0; i < arr.length; i++) {
		System.out.print( arr [i] );
	}
	
	System.out.println("");
	
		arr [0] = 9;
		arr [9] = 0;
	
	for(int i = 0; i < arr.length; i++) {
		System.out.print( arr [i] );
	}
	
}

	
	
}
