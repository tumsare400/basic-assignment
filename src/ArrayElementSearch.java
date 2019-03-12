import java.util.Scanner;
public class ArrayElementSearch {
  public static void main(String [] args)
  {
	  int array[]={5,12,14,6,78,19,1,23,26,35,37,7, 52 ,86,47};
	  int count=0;
	  int search;
	  
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("Enter search number");
	  search=scanner.nextInt();
	  
	  for(int i=0;i<array.length;i++)
	  {
		if(search==array[i])
		{
			count++;
			break;
		}
	  }
	  scanner.close();
	  if(count!=0)
	  {
		  System.out.println(" search element found");
	  }
	  else
		  System.out.println("Element is not found");
  }
}
