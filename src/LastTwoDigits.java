//find the last two digits of x^y
public class LastTwoDigits {
	
	
	private static void lastTwo(int x, int y) {

	int p =1;
	for (int i=0; i<y; i++) {
		p *=x;
	}
	System.out.println("the x^y is: " +p);
	System.out.println("the last two digits are: " +(p%100));
	
	
	}

	public static void main(String[] args) {

		lastTwo(11, 3);
		
		
	}

}
