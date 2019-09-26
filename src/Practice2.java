import java.util.ArrayList;
import java.util.List;

public class Practice2 {

	public static List<Integer> hseq (int x){
		
		List <Integer> list = new ArrayList<Integer>();
		list.add(x);
		
		while (x !=1) {
			if (x%2==0) {
				x= x/2;
			list.add(x);
			}
			
			else {
				x= (x*3+1);
			list.add(x);
			}
	}
		return list;
	}	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(hseq(3));
		
	}
}
