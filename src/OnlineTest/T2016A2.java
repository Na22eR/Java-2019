package OnlineTest;

public class T2016A2 {

	
	static int formula(double par) {
		double  Formel = ( (17.2*3.25) / (17.2-1) ) + 17.2;
		int Ergebnis = (int) Formel;
		return Ergebnis;
		
	}
	
	static String calcStars(int values [] ) {
		
		double anz = 0;
		double summe = 0;
		for(int i = 0; i < values.length-1; i ++) {
			anz++;
			summe += values[i];
		}
		
		double Ergebnis = summe / anz;
		String stars = "";
		if(Ergebnis < 2.4) {	stars = "*";	}
		if(Ergebnis <= 2.8 && Ergebnis >= 2.4) {	stars = "**";	}
		if(Ergebnis > 2.8 && Ergebnis <= 5) {	stars = "***";	}
		
		return stars;
		
	}
	
	static boolean hasBigNumber(double num [] ) {
		
		for(int i = 0; i < num.length; i++) {
			
			if(num[i] > 107) {	return true; 	}
		}
		
		return false;
		
	}
	
	
}
