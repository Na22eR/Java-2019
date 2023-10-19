package OnlineTest;

public class T2015A1 {

	static void number(int von, int bis, int keinTeiler) {
		
		String Ausgabe = "";
		
		for(int i = von; i <= bis; i++) {
			
			if(i%4 != 0 && i%keinTeiler != 0 ) {
				
			Ausgabe += i + "\t";		
				
			}
			
		}
		
		System.out.println(Ausgabe);
		
	}
	
	
	static double meanValue(int x1, int x2) {
		
		double x01 = (double) x1;
		double x02 = (double) x2;
		double nr3 = (double) 571;
		double nr4 = (double) 3;
		
		double Ergebnis = (x01 + x02 + nr3)/nr4;
		
		return Ergebnis;
	}
	
}
