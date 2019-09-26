
public class Palindrome {

		public static boolean isPalindrome (String str) {
			int length = str.length();
			
			for (int i=0; i<length/2; i++) {
				if (str.charAt(i) == str.charAt(length-i-1)) {
					return true;
				}
			}
			return false;
		}

		//another way (just switch false and true)
		static boolean isPalindrome1(String s) {
		  int n = s.length();
		  for (int i = 0; i < (n/2); ++i) {
		     if (s.charAt(i) != s.charAt(n - i - 1)) {
		         return false;
		     }
		  }
	
		  return true;
		}

	
public static void main(String[] args) {
	System.out.println(isPalindrome("level"));
	System.out.println(isPalindrome1("level"));

}


}
	