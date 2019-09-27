import java.util.HashMap;
import java.util.Map;
import java.util.Set;


//Find all duplicate characters in a String and print each of them.
public class FindDuplicateCharacters {

    public static void printDuplicateCharacters(String str) {
    	
        char[] characters = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        
        for (Character i : characters) {
            if (charMap.containsKey(i)) {
                charMap.put(i, charMap.get(i) + 1);
            } else {
                charMap.put(i, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        System.out.printf("List of duplicate characters in String '%s' %n", str);
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }
	
    
    public static void main(String args[]) {
        printDuplicateCharacters("I want to see how many");
        printDuplicateCharacters("duplicated char");
        printDuplicateCharacters("are here");
    }
	
	
}
