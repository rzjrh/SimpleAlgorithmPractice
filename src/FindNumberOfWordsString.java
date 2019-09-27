
public class FindNumberOfWordsString {
	
	

	public static void main(String[] args) {
		
		String str = "This is the string   test for finding the number of words in this string";
		System.out.println(str);
		System.out.println("there are "+str.split("\\s+").length+" words in this String.");
	}

}
