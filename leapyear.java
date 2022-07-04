import java.util.Scanner;
class leapyear
{
public static void main(String args[])
{
	Scanner sc =new Scanner (System.in);
	System.out.println("Enetr the year:");
	int year=sc.nextInt();
	if(year%4==0)
	{
	System.out.println("This is leap year");
	 }
	else if(year%400==0)
	{
	System.out.println("This is leap year");
	 }
	else if(year%100==0)
	{
	System.out.println("This is not leap year");
	 }
	else
	{
	System.out.println("This is not leap year");
	}

}
	
}