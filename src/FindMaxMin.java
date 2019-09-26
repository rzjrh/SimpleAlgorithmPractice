//Find the Maximum and Minimum element in the array 

public class FindMaxMin {

	
	public static void getMax (int [] arr) {
		int max = arr[0];
		for (int i=0; i<arr.length; i++) {
			if (arr[i]> max) {
				max= arr[i];
			}
		}
		
		System.out.println("the maximum element in this array is: "+max);
	}
	
	public static void getMin (int [] arr) {
		int min = arr[0];
		for (int i=0; i<arr.length; i++) {
			if (arr[i]< min) {
				min= arr[i];
			}
		}
		
		System.out.println("the minimum element in this array is: "+min);
	}
	
	
	public static void main(String[] args) {
		
		int [] arr1= {11,2,5,77,35,20,1,55,5,9,33,5,4,65,8,4,22,5,15};
		getMax(arr1);
		getMin(arr1);
	}

	

}
