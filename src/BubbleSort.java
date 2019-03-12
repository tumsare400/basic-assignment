
public class BubbleSort {
   public static void main(String [] args)
   {  
	   int arr[]={5,12,14,6,78,19,1,23,26,35,37,7,52	,86	,47};
	   
	   int temp = 0;   
	   
	  System.out.println("element before sorting");
	  for(int i=0;i<arr.length;i++)
	  {
		  System.out.print(arr[i]+" ");
	  }
	  System.out.println();
       for(int i=0; i <arr.length; i++)
       {  
               for( int j=1; j <(arr.length-i); j++)
               {  
                        if(arr[j-1] > arr[j])
                        {  
                               //swap elements  
                               temp = arr[j-1];  
                               arr[j-1] = arr[j];  
                               arr[j] = temp;  
                       }  
                        
               }  
      }
       System.out.println("element after sorting");
       for(int i=0;i<arr.length;i++)
 	  {
 		  System.out.print(arr[i]+" ");
 	  }
   }
}
