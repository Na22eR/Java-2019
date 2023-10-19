package OnlineTest;

public class T2016A1 {

	int km;
	double fuel;
	double verbrauch;
	int startkm;
	
	
	void initAuto(int kmInit) {
		startkm = kmInit;
		km = kmInit;
		fuel = 11.1;
		verbrauch = 6.3;
	}
	
	
	void drive(int distance) {
		km += distance;
		fuel -= (distance*(verbrauch/100) ); if(fuel <= 0) { fuel = 0; }
	}
	
	
	int getGefahren() {
		return km-startkm;
	}
	
}
