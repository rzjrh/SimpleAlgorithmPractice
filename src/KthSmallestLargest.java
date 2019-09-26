import java.util.Arrays;

//find the K'th smallest or largest element of unsorted array
public class KthSmallestLargest {

	public static int ksmall (int[] arr, int k) {
		Arrays.sort(arr);
		System.out.println("the " +k+"'th Smallest element is: "+ arr[k-1]);
		return arr[k-1];
	}
	
	public static int klarge (int[] arr, int k) {
		Arrays.sort(arr);
		System.out.println("the " +k+"'th largest element is: "+ arr[arr.length-k]);
		return arr[arr.length-k];
	}
	
	
	public static void main(String[] args) {
		
		int arr1[]= {11,2,55,4,7,9,8,32,6,8,13,100,14,20,22,51,18};
		
		ksmall(arr1, 5);
		klarge(arr1, 1);
	}
	
}
