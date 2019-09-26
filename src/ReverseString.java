//how to reverse a string in Java?

public class ReverseString {
	
	public static void reverseStringByWord(String str) {
		String a[] = str.split(" ");
		System.out.println("the reverse of ("+str+") by word is:");
		for (int i=a.length-1; i>=0; i--) {
			System.out.print(a[i]+ " ");
		}
	}
	
	
	public static void reverseStringByLetter(String str) {
		System.out.println("\nthe reverse of ("+str+") by letters is:");
		StringBuilder sb = new StringBuilder ();
		sb.append(str);
		sb= sb.reverse();
		System.out.println(sb);
	}
	

	public static void main(String[] args) {

		String str1 = ("My name is Reza");
		reverseStringByWord(str1);
		reverseStringByLetter(str1);
	}
}