import java.util.Scanner;
public class UserAuthentication {
  public static void main(String [] args){
	  String username;
	  String password;
	  int flag=0;
	  
	  Scanner scanner=new Scanner(System.in);
	  for(int i=1;i<=3;i++)
	  {
		
		  System.out.println("Enter Username");
		  username=scanner.nextLine();
		  
		  System.out.println("Enter Password");
		  password=scanner.nextLine();
		  
	     if(username.equals("payal")&& password.equals("payal"))
	     {
	    	 flag=1;
	         break;
	     }
	     if(flag==1)
	    	 break;
	  }
	  scanner.close();
	  if(flag==0)
	 
		  System.out.println("Contact Admin");
	  
	  else
		 System.out.println("Welcome");
     
    }
  
}
