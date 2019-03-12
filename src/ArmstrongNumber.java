import java.util.*;
import java.lang.Math; 
public class ArmstrongNumber {
      public static void main(String [] args)
      {
    	  int number;
    	  int originalvalue;
    	  int reminder;
    	  int result=0;
    	  int count=0;
    	  
    	  Scanner scanner=new Scanner(System.in);
    	  System.out.println("Enter the No.");
    	  number= scanner.nextInt();
    	  
    	  originalvalue=number;
    	  int temp=number;
    	  while(temp!=0)
    	  {
    		  temp=temp/10;
    		  count++;
    	  }
    	  
    	  while( originalvalue!=0)
    	  {
    		  reminder=originalvalue%10;
    		 result+=Math.pow(reminder, count);
    		  originalvalue=originalvalue/10;
    	  }
    	  if(result==number)
    		 System.out.println("Number is Armstrong");
    	  else
    		  System.out.println("Number is not Armstrong");
    	  
    	  scanner.close();
      }
      
}
