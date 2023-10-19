package SortierAlgorithmen;

public class Insertionsort {

	public static int [] insertionSort (int zuSort [] ) {
	
		for (int j = 0; j < zuSort.length-1; j++) {
		
			if(zuSort[j] > zuSort[j+1] ) {
					
				int safe = zuSort [j+1];
				zuSort[j+1] = zuSort[j];
				zuSort[j] = safe;
					
				for (int x = j; x > 0; x--) {
					if(zuSort[x] < zuSort[x-1] ) {
							
						int safe2 = zuSort [x];
						zuSort[x] = zuSort[x-1];
						zuSort[x-1] = safe2;
					}
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
			
			int sort [] = insertionSort(arr);
			
			for (int i = 0; i < sort.length; i++) {
				System.out.print(sort[i] + "\t");
			}
			
		}
		
	}	
	