package Start_Automation;

import java.util.Scanner;

public class A_5_march_Marksheet {

	public void generateMarksheet(String name, int rollNumber, String cls, float eng, float math, float hindi, float sst, float science )
	{
		System.out.println("Name of the student is:"+ name);
		System.out.println("roll number of the student is:"+ rollNumber);
		System.out.println("Student class is"+ cls);
		System.out.println("your marks in hindi:"+ hindi);
		System.out.println("your marks in eng:"+ eng);
		System.out.println("your marks in sst:"+ sst);
		System.out.println("your marks in science:"+ science);
		System.out.println("your marks in math:"+ math);
		
		float totalNum = hindi + math + science + eng + sst;
		float percentage = (totalNum/500)*100;
		System.out.println("your total marks are:"+ totalNum);
		System.out.println("your percentae is:"+ percentage);
		
		if (percentage<33)
		{
			System.out.println("you are failed");
			}
		else
		{
			if(percentage>=33 && percentage <=45)
			{
				System.out.println("you are 3rd devision passed");
				}
			
			else if (percentage >45 && percentage <=60)
			{
				System.out.println("you are 2nd devision passed");
				}
			
			else
			{
				System.out.println("you are 1st devision passed");
			}
		}
	}
	
	public static void main(String[] args) {
		A_5_march_Marksheet ob = new A_5_march_Marksheet();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		String name = sc.next();
		System.out.println("Please enter your roll number");
		int rollNumber = sc.nextInt();
		System.out.println("Please enter your class");
		String cls = sc.next();
		System.out.println("Please enter your marks of each subject");
	    float eng = sc.nextFloat();
	    float hindi = sc.nextFloat();
	    float math = sc.nextFloat();
	    float sst = sc.nextFloat();
	    float science = sc.nextFloat();
	    if(eng<=100 && math<=100 && sst<=100 && sst<=100 && science<=100)
	    {
	    ob.generateMarksheet(name, rollNumber, cls, eng, math, hindi, sst, science);
	    }
	    else
	    {
	    	System.out.println("please enter valid number in each subject");
	    }
	}
}
	
	
	
	    
