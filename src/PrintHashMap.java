import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

//how to print all keies and values in HashMap
public class PrintHashMap {
	
	
	
	
	public static void main(String[] args) {
        HashMap<String, String> user1 = new HashMap<String, String>();
        user1.put("Key1", "Reza");
        user1.put("Key2", "Great");
        user1.put("Key3", "Coder");
        
        SortedSet<String> keySet = new TreeSet<>(user1.keySet());
        
        
        System.out.println(user1);
        
        // get the keys by using the keySet method
        Set<String> keys = user1.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(user1.get(key));    
        }
    }
	
	

}
