import java.util.Scanner;
public class SimpleCompoundIntrest {
    public static void main(String [] args){
    	double simple;
    	double compound;
    	double rate;
    	double year;
    	double principle;
    	  
  	  Scanner scanner=new Scanner(System.in);
  	  System.out.println("Enter amount");
  	  principle= scanner.nextDouble();
  	  
  	  System.out.println("Enter the rate of interest.");
 	  rate= scanner.nextDouble();
 	  
 	  System.out.println("Enter the No of year");
 	  year= scanner.nextInt();
 	  
 	  simple=(principle*year*rate);
 	  compound=principle * Math.pow(1.0+rate/100.0,year) - principle;
 	  
 	  System.out.println("Simple Interest is="+simple);
 	  System.out.println("Compound Interest is="+compound);
 	  
 	 scanner.close();
    }
   
}
