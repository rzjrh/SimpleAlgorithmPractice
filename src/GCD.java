
public class GCD {
	
	
	private static int gcdCalc (int a, int b) {
		if ( b== 0)
			return a;
		return gcdCalc(b, a%b);
	}

	
	//test here
	public static void main(String[] args) {
		int a=88, b=16;
		System.out.println("The GCD of "+a+" and "+b+" is: "+gcdCalc(a,b));
	}

}
