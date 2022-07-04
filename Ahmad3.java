import java.util.Scanner;
class A
{
	
	Scanner sc =new Scanner(System.in);
	A()
	{	
		System.out.print("Enter the NAME ");
		String name =sc.next();

		System.out.print("Enter kannada : ");
		int k =sc.nextInt();	

		System.out.print("Enter ENglish: ");
		int e=sc.nextInt();
	
		System.out.print("Enter Hindi : ");
		int h =sc.nextInt();	

		System.out.print("Enter Science : ");
		int s =sc.nextInt();	

		System.out.print("Enter Social science : ");
		int ss =sc.nextInt();
	
		System.out.print("Enter Mathamatics : ");
		int m  =sc.nextInt();	
		int total = k+ e+ h+ m+ s+ss;

		int per = total / 6  ;  

		if(per >=85 )
		{
			System.out.println("HI : "+name +" Your total marks is : "+total + "  and you got  "+ per +"% "+ "  Destiction ");	
		}
		else if (per > 60 && per < 85 )
		{
			System.out.println("HI : "+name +" Your total marks is : "+total + "  and you got  "+ per +"% "+ "  First Class ");	
		}
		
		else if (per > 50  && per < 60 )
		{
			System.out.println("HI : "+name +" Your total marks is : "+total + "  and you got  "+ per +"% "+ "  Second Class ");	
		}
		else if (per > 35   && per < 50 )
		{	
			System.out.println("HI : "+name +" Your total marks is : "+total + "  and you got  "+ per +"% "+ "  Just Pass  ");	
		}
		else
		{	
			System.out.println("HI : "+name +" Your total marks is : "+total + "  and you got  "+ per +"% "+ " FAIL  ");
		}
		
	}
}
class Demo5
{
	public static void main(String args[])
	{
		A a =new A();
	}

}
