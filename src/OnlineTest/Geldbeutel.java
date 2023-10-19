 /* Teilnahmecode: mj588 Namen: Nasser-Eddin Yacine MatNR: 2072377 */

package OnlineTest;

public class Geldbeutel {

	int anzahlMuenzen;
	int gewicht = 209;
	int betrag;
	
	
	
	
	void addMoney(int betr, int anzMuenz) {
		
		betrag += betr;
		anzahlMuenzen += anzMuenz;
		gewicht += (anzMuenz*18);
		
	}
	
	int getBetrag () {
		return betrag;
	}
	
	int getGewicht() {
		return gewicht;
	}
	
	
	
	
	/*
	public static void main(String args [] ) {
	
		Geldbeutel gb = new Geldbeutel();
	
		gb.addMoney(1000, 5);
		
		System.out.println(  gb.getBetrag()  );
		System.out.println(  gb.getGewicht() );
		
	}
	*/
	
}
