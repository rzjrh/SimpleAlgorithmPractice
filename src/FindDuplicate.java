import java.util.HashSet;
import java.util.Set;

//find the duplicate element in an array 

public class FindDuplicate {
//	
//	private static  void find1 (int[] arr) {
//		int [] result = {0};
//		for (int i=0; i<arr.length-1; i++) {
//			for (int j=i+1; j<arr.length-1-i; i++) {
//				if (arr[i]==(arr[j])) {
//					
//				}
//				
//			}
//		}
//		System.out.println(result);
//
//	}
	
	
	
	
	
	
	public static void main(String args[]) { 
		
		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };

//		int[] nums = { 10, 0, 11, 22, 11, 2, 8, 77, 7, 31, 10, 8, 120, 4, 9, 44, 35 }; 
//		find1(nums);
	
	
	
	
	//use HashSet data structure to find duplicates 
	System.out.println("Duplicate elements from array using HashSet data structure"); 
	Set<String> store = new HashSet<>(); 
	for (String name : names) { 
		if (store.add(name) == false) { 
			System.out.println("found a duplicate element in array : " + name); 
			} 
		}
	
	
	
			}
		
	

}
