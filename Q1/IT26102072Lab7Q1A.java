import java.util.Scanner;
public class IT26102072Lab7Q1A
{
	public static void main(String[]args)
	{
		
		Scanner input = new Scanner(System.in);
		int mark1,mark2,mark3,mark4,sum;
		double avg;
		

		System.out.print("Enter subject mark 1: ");
		mark1 = input.nextInt();
		System.out.print("Enter subject mark2: ");
		mark2 = input.nextInt();
		System.out.print("Enter subject mark 3: ");
		mark3 = input.nextInt();
		System.out.print("Enter subject mark 4: ");
		mark4 = input.nextInt();
		
		
		System.out.println(" ");
		
		sum=(mark1+mark2+mark3+mark4);
		avg=(sum/4.0);
		System.out.println("average is :" + avg);
		
		if (avg>=75)
		{
			System.out.print("Overall grade is : Distinction");
		}
		else if (avg>=50)
		{
			System.out.print("Overall grade is : credit");
		}
		else
		{
			System.out.print("Overall grade is : fail");
		}
	}
}