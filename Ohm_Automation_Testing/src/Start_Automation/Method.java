package Start_Automation;

public class Method {
	
	public void addition()
	{
		int a = 30;
		int b = 20;
		int c = a+b;
		
		System.out.println(c);
		
		
	}
	
	public void subtraction()
	{
		int a = 30;
		int b = 20;
		int c = a-b;
		
		System.out.println(c);
		
	}
	
	public void multiply()
	{
		int a = 30;
		int b = 20;
		int c = a*b;
		
		System.out.println(c);
		
	}

	public void devide()
	{
		int a = 30;
		int b = 20;
		int c = a/b;
		
		System.out.println(c);
		
	}
	
	public static void main(String[] args)
	{
		Method ob = new Method();
		ob.addition();
		ob.subtraction();
		ob.multiply();
		ob.devide();
		
	}
	
	
	
	}

