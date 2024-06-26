package Start_Automation;

import java.util.Scanner;

public class Odd_And_Even{ 
	
	public void getoddEven(int num)
	{
		int remainder = num%2;
		if(remainder ==0)
		{
			System.out.println("given number is:"+ num+ "is even");
		}
		else
		{
			System.out.println("given number is:"+num+ "is odd");
		}
	}
	public static void main(String[] args) 
	{
		Odd_And_Even ob = new Odd_And_Even();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter number");
		int num = sc.nextInt();
		ob.getoddEven(num);
	}

}
