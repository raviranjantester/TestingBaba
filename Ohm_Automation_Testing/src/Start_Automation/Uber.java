package Start_Automation;

import java.util.Scanner;

public class Uber {
    public static void ride(float dis,String name,long pnum,String month)
    {
  	 float fare;
  	 System.out.println("Passenger Name : "+name);
  	 System.out.println("Phone Number   : "+pnum);
  	 System.out.println("Month          : "+month);
  	 System.out.println("Total Distance : "+dis);
         if(month.equals("June") || month.equals("July"))
            {
               fare=dis*5;
          	 System.out.println("Total Fare     : "+fare);
            }
         else if(month.equals("January") || month.equals("February") || month.equals("March")
      		   || month.equals("April") || month.equals("May") || month.equals("August")
      		   || month.equals("September") || month.equals("October") || month.equals("November")
      		   || month.equals("December"))
            {
      	   if(dis<100)
      	      {
      		   fare=dis*8;
            	   System.out.println("Total Fare     : "+fare);
      		   
      	      }
      	   else if(dis>=100 && dis< 300)
      	      {
      		   fare=dis*6;
            	   System.out.println("Total Fare     : "+fare); 
      	      }
      	   else 
      	      {
       		   fare=dis*4;  
            	   System.out.println("Total Fare     : "+fare);
      		  }
            }
         else
	      {
		   System.out.println("Enter the correct month or in correct format");
	      }
    }
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("WELCOME TO UBER RIDE");
System.out.println("Please Enter Your Name:-");
String name=sc.nextLine();
System.err.println("Enter Your Phone Number:-");
long pnum=sc.nextLong();
System.out.println("Enter the month in which you going to travel:-");
String month=sc.next();

System.out.println("Enter The Distance Of Your Ride In Kilometer:-");
float dis=sc.nextFloat();
if(dis>0  )
{  
if(pnum<=9999999999L && pnum>999999999)
 {
	ride(dis,name,pnum,month);
 }
else
{
    System.out.println("Invalid Phone Number");
}
}
else
{
System.out.println("Distance Can't Be 0");
}
}

}



