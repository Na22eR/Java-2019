package OnlineTest;

public class T2014A2 {

	String typ;
	int bj;
	int zStand;
	int lastSt;
	
	T2014A2(String t, int b){
		typ = t;
		bj = b;
		zStand = 129;
		lastSt = 0;
	}
	
	
	void AddEn(int kwh) {
		zStand += kwh;
	}
	
	int ablesen() {
		lastSt = zStand;
		return zStand;
	}
	
	double getCost() {
		double cost = ( (zStand-lastSt)*64)/100;
		return cost;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
