package SortierAlgorithmen;

public class Bubblesort {

	public static int [] bubbleSort(int zuSort [] ) {
		
		for (int x = 0; x < zuSort.length; x++) {
			
			int i = 0;
			
			for (int j = i+1; j < zuSort.length; j++) {
					
				if (zuSort[i] > zuSort[j] ) {
						
					int safe = zuSort[j];
					zuSort[j] = zuSort[i];
					zuSort[i] = safe;
					i++;
				}
					
				else { i++; }	
			}
			
		} 
		return zuSort;
	}
	
//Überprüfung	
public static void main(String args [] ) {
		
		int arr [] = {9,5,1,8,6,3};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr [i] + "\t");
		}
		
		System.out.println();
		
		int sort [] = bubbleSort(arr);
		
		for (int i = 0; i < sort.length; i++) {
			System.out.print(sort[i] + "\t");
		}
		
	}
	
}
