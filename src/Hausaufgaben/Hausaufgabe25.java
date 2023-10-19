package Hausaufgaben;

import static jsTools.Input.*;

public class Hausaufgabe25 {

public static void main(String main [] ) {

	char arr [] = new char [10];
	char f = 'a';
	for (int i = 0; i < arr.length; i++) {
		arr [i] = f;
		f++;
	}
	char x = readChar("Char festlegen: ");
	
	char f2 = 'a';
	char barr [] = new char [10];
	for (int i = 0; i < barr.length; i++) {
		barr [i] = f2;
		f2++;
	}
	
	char y = readChar("Replace-Char festlegen: ");
	
	
	
	
	
	print(arr);
	//printReverse(arr);
	//revert(arr);
	System.out.println(	contains(arr, x)	);
	System.out.println(	countx(arr, x)		);
	System.out.println(equals(arr, barr) );
	replace(arr, x, y);
	print(arr);
}



public static void print(char arr []) {
	
	for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println(" ");
	
}


public static void printReverse(char arr [] ) {
	
	for(int i = arr.length-1; i >= 0; i--) {
		System.out.print(arr [i] + " ");
	}
	System.out.println(" ");
	
}


public static void revert(char arr [] ) {
	
	char storage;
	for(int i = 0; i < arr.length/2; i++) {
		storage = arr [i];
		arr[i] = arr[arr.length-1-i];
		arr[arr.length-1-i] = storage;
	}
	
	for(int j = 0; j < arr.length; j++) {
		System.out.print(arr [j] + " "); 
	}
	System.out.println(" ");
	
}


public static boolean contains(char arr [], char x) {
	
	for(int i = 0; i < arr.length; i++) {
		if(arr[i] == x) {		return true;		}	//else if(i == 9 && arr[i] != x) {		return false;		}
	}
	return false;
}


static int countx(char arr [], char x) {
	
	int count = 0;
	for(int i = 0; i < arr.length; i++) {
		if(arr [i] == x) {count++;}
	}
	
	return count;
	
}


static boolean equals(char arr [], char barr [] ) {
	
	int i = 0;
	while(arr [i] == barr [i]) {
		if (i == arr.length-1) {return true;}
		i++;
	}
	
	return false;
	
}


public static void replace(char arr [], char x, char y) {
	
	for(int i = 0; i < arr.length; i++) {
		if(arr [i] == x) {arr [i] = y;}
	}
	
	
}



}
