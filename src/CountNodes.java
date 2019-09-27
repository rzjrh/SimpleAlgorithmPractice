//
////Program to count leaf nodes in a binary tree
//
////making class inside of the class 
////this is Node class 
//class Node  
//{ 
//    int data; 
//    Node left, right; 
//   
//    public Node(int item)  
//    { 
//        data = item; 
//        left = right = null; 
//    } 
//} 
//
//
////This is the actual class 
//public class CountNodes {
//	
//	 Node root; 
//	 
//	 public CountNodes () {
//		 this.root= root;
//	 }
//     
//	    /* Function to get the count of leaf nodes in a binary tree*/
//	    int getLeafCount()  
//	    { 
//	        return getLeafCount(root); 
//	    } 
//	   
//	    int getLeafCount(Node node)  
//	    { 
//	        if (node == null) 
//	            return 0; 
//	        if (node.left == null && node.right == null) 
//	            return 1; 
//	        else
//	            return getLeafCount(node.left) + getLeafCount(node.right); 
//	    } 
//	
//	public static void main(String[] args) {
//
//		CountNodes tree = new CountNodes(); 
//        tree.root = new Node(1); 
//        tree.root.left = new Node(2); 
//        tree.root.right = new Node(3); 
//        tree.root.left.left = new Node(4); 
//        tree.root.left.right = new Node(5); 
//           
//        System.out.println("The leaf count of binary tree is : "  + tree.getLeafCount()); 
//		
//	}
//
//}
