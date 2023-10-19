package OnlineTest;

public class T2014A1 {

	static void prL(int indent, int h, int b) {
		
		for(int i = 0; i < h; i++) {
			space(indent);
			System.out.println("*");
		}
		
		space(indent);
		for(int i = 0; i < b; i++) {
			System.out.print("*");
		}

	}
	
	
	static void space(int n) {
		for(int i = 0; i <= n; i++) {
		System.out.print(" ");
		}
	}
	
	
	static int anzTeiler(int n, int m) {
		
		int anz = 0;
		while(n%m == 0) {
			n = n / m;
			anz ++;
		}
	
		return anz;
		
	}
	
	
	static String xChange(String s, char x) {
	
		String s2 = "";
		for(int i = 0; i < s.length(); i++) {
			if( s.charAt(i) != x) {	s2 += s.charAt(i);	}
			if( s.charAt(i) == x) {	s2 += "@679@"; }
			
		}
		
		s = s2;
		
		return s;
		
	}
		
	
	
}
