package Hausaufgaben;

public class Hausaufgabe35 {

public static void main(String main [] ) {

	Spx h;
	h = new Spx(5);
	Spx d;
	d = new Spx(5);
	
	h.intChange(0, 6);
	
	System.out.println(h.getArr(0) );
	System.out.println(d.getArr(0) );
	
	
}

}

class Spx {

	static int counter = 0;
	int arr [];
	
	Spx(int l) {
		
		counter++;
		arr = new int[l];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = l;
			l--;
		}
		
	}
	
	void intChange(int st, int xc) {
		arr[st] = xc;
	}
	
	int getArr(int j) {
		return arr[j];
	}
}