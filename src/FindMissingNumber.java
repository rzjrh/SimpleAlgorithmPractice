
//find the missing number in the array 
// we need to find the sum of the array (n*n+1)/2 
//which n is number of element in the array include the missed one
//here is only one element in sorted array is missed 
public class FindMissingNumber {
	
	static int findMissing(int a[]) {
        int total; 
        int result = 0;
        int n = (a.length+1);
        total = (n) * (n + 1) / 2; 
        for (int i = 0; i < n; i++) 
            result= (total -= a[i]); 
        return result; 
    } 
	
	

	public static void main(String[] args) {

		int [] arr = {1,4,5,6,8,2,7,3,10};
		System.out.println("the missing number in the array is: "+findMissing(arr));
		
	}

}
