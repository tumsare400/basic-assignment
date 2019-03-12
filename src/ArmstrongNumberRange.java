
public class ArmstrongNumberRange 
{ 
   public static void main (String [] args) 
      { 
         for (int i = 100 ; i<= 1000 ; i++) 
          { 
            int originalvalue = i; 
            int remender;
            int result = 0;

            while (originalvalue > 0) 
            { 
              remender = originalvalue% 10; 
             result = result + (remender * remender * remender); 
             originalvalue = originalvalue / 10; 
            } 
            if (result == i ) 
            { 
               System.out.println (result+ " is Armstrong number"); 
            } 
          } 
     } 
}
 