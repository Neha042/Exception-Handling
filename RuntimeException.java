package ExceptionHandling;

import java.util.Scanner;

public class RuntimeException {

	public static void main(String[] args) 
	{
		demo();

	}
	
	
	public static void demo()
	{
		int num1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Numbers : ");
		num1=sc.nextInt();
		try
		{
			if(num1%2==0)
			{
				throw new ArithmeticException("It is Even NUmber");
			}
			else
			{
				throw new ArithmeticException("It is Odd NUmber");
			}
		}
		catch(Exception e)
		{
			System.out.println("Msg="+e.getMessage());
		}
	}

}
