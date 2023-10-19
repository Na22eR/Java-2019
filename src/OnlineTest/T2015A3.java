package OnlineTest;

public class T2015A3 {

	static int [] [] genMatrix(int dim){
		
		int arr [] [];
		arr = new int [dim] [dim];
		
		for(int i = 0; i < dim; i++) {
			for (int j = 0; j < arr.length; j++) {
				
				if(i == j){
					arr [i] [i] = i;	
					
				} else if ( j > i ) {
					arr [i] [j] = arr [i] [j-1] + arr [i+1] [j] + 3;
				
				} else if ( i > j ) {
				arr [i] [j] = arr [i-1] [j] + arr [i] [j+1] + 3;
				
				}
					
			}
			
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j ++) {
				System.out.print(arr [i]  [j] +  "\t");
			}
			System.out.println();
			System.out.println();
		}
		
		
		return arr;
				
	}
	
	public static void main(String args [ ]) {
		genMatrix (5);
	}
}
