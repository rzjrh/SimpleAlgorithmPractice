//create a simple linked list with all basic attributes 

import java.util.LinkedList;
public class CreateLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> object = new LinkedList<>();
		object.add("One");
		object.add("Two");
		object.addLast("last");
		object.addFirst("first");
		object.add("three");
		object.add("four");
		object.add("five");
		object.remove(2);
		object.remove("five");
		object.add("six");
	

		System.out.println("the linked list is: " + object);
	}

}
