package SortierAlgorithmen;

public class Selectionsort {

	public static int [] selectionSort(int zuSort [] ) {
		
		for (int i = 0; i < zuSort.length-1; i++) {
			
			for (int j = i+1; j < zuSort.length; j++) {
				
				if(zuSort[j] < zuSort[i] ) {
					
					int safe = zuSort [i];
					zuSort[i] = zuSort[j];
					zuSort[j] = safe;
					
				}
				
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
		
		int sort [] = selectionSort(arr);
		
		for (int i = 0; i < sort.length; i++) {
			System.out.print(sort[i] + "\t");
		}
		
	}
	
}