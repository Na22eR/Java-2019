 /* Teilnahmecode: mj588 Namen: Nasser-Eddin Yacine MatNR: 2072377 */

package OnlineTest;

public class SomeFunctions {

	int formula1(double par) {
		
		double formel = par * 752 / 8;
		int ergebnis = (int) formel;
		return ergebnis;
		
	}
	
	
	int minMaxDiff(int values [] ) {
		
		int max = values [0];
		int min = values [0];
		int diff;
		
		for(int i = 0; i < values.length; i++) {
			
			if(max < values [i] ) {
				max = values [i];
			}
			
			if(min > values [i] ) {
				min = values [i]; 
			}
			
		}
			
		diff = max - min;
		return diff;
			
	}
	
	
	void initArr(int theArray [], int valOfFirst ) {
		
		theArray [0] = valOfFirst;
		
		for(int i = 1; i < theArray.length; i++) {
			theArray [i] = theArray [(i-1)] +36;
		}
		
	}
		
}
