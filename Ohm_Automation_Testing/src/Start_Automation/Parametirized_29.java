package Start_Automation;

import java.util.Scanner;

public class Parametirized_29 {
	
	public void addition (int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println(d);
}
    
	public void subtract (int a, int b, int c)
	{
		int d = a-b-c;
		System.out.println(d);
}
    public void multiply (int a, int b, int c)
    {
            int d = a*b*c;
    		System.out.println(d);
}
	public void devide (int a, int b, int c)
	{
		int d = a/b/c;
		System.out.println(d);
}
	
	public static void main(String[] args) {
	
		Parametirized_29 ob = new Parametirized_29();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please inter the value ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		ob.addition(a, b, c);
		ob.subtract(a, b, c);
		ob.multiply(a, b, c);
		ob.devide(a, b, c);
		
		
	}
    }
    
 

