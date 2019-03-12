import java.util.Scanner;
public class tax {
	public static void main(String[] args) {
		double income;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Your Income");
		income = scanner.nextInt();
		if(income>0 && income <=180000)
		{
			System.out.println("Your Income Is="+income);
		}
		else if(income>180000 && income<=300000)
		{
			income=income+(0.1*income);
			System.out.println("Your Income Is="+income);
		}
		else if(income>300000 && income<=500000)
		{
			income=income+(0.2*income);
			System.out.println("Your Income Is="+income);
		}
		else if(income>500000 && income<=1000000)
		{
			income=income+(0.3*income);
			System.out.println("Your Income Is="+income);
		}
		scanner.close();
	}

}
