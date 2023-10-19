package OnlineTest;

public class T2015A2 {

	int matNr;
	String nameFach;
	int credits;
	int note;
	
	
	void setValues(int mNr, String fach, int cps, int n) {
		matNr = mNr;
		nameFach = fach;
		credits = cps;
		note = n;
	}
	
	double getNoteGewichtet() {
		double GesamtCredits = 180;
		double nr1 = (double) note;
		double nr2 = (double) credits;
		
		double Ergebnis = (nr1 + nr2) / GesamtCredits;
		
		return Ergebnis;
		
	}	
	
}
