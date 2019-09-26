
public class BubbleSort {
	
	public static int[]  bubbleSort(int[] list) {  
        int temp=0;
         for(int i=0; i < list.length-1; i++){  
                 for(int j=0; j <list.length-1-i; j++){  
                          if(list[j] >list[j+1] ){  
                                 temp = list[j];  
                                 list[j] = list[j+1];  
                                 list[j+1] = temp;  
                         }                            
                 }  
         }
         return list;    
	}
	
	public static void main(String[] args) {

		 int arr[] ={3,60,35,2,45,320,5};
		 System.out.println("Array before Bubble Sort");  
	      for(int i=0; i < arr.length; i++){  
	              System.out.print(arr[i] + " ");   
	      }
	      
      bubbleSort((arr));
      System.out.println("\n\nArray after Bubble Sort");  
      for(int i=0; i < arr.length; i++){  
              System.out.print(arr[i] + " ");  
      }  
  

 }  
}
