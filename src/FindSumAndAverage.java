// find sum and average of an array 

public class FindSumAndAverage {

	
	private static int findSum (int [] arr) {
		int sum=0;
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	
	private static int findAvg (int [] arr) {
		int sum =0;
		int avg=0;
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
			avg = sum/(arr.length);
		}
		
		return avg;
	}
	
	
	
	public static void main(String[] args) {

		int [] arr1 = {1,4,5,8,7,11,0,10,55,4,5};
		
		System.out.println(findSum(arr1));
		System.out.println(findAvg(arr1));
	}

}
