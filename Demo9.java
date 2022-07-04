import java.util.Scanner;

class Tester 
{
	static Scanner sc=new Scanner(System.in);
	static int id;
	static String name;
	static int age;
	static int salary ;
	static String desig;
	static void create()
	{
		System.out.print("ENter the Id : ");
		  id=sc.nextInt();

		System.out.print("ENter the Name : ");
		 name= sc.next(); 

		System.out.print("ENter the Age : ");
		 age =sc.nextInt();
		salary =25000;
		desig="Tester ";	
	}
	static void display()
	{
		if(name==null)
			System.out.println("You have not entered the details of Tester");
		else
		{
			System.out.println("***********************************");
			System.out.println(" ID : " + id );
			System.out.println("Name : " + name);
			System.out.println("Age : " + age );
			System.out.println("Salary : " + salary  );
			System.out.println("Designation : " + desig);
		}
	}
	static void raiseSalary()
	{
		salary =25000;

		salary=salary+1000;
		System.out.println("Raised salary of Tester"+salary);

	}
}
class Manager  
{
	/*Manager()
	{
		salary = 90000;
		desig=" Manager ";
	}*/
	static Scanner sc=new Scanner(System.in);
	static int id;
	static String name;
	static int age;
	static int salary ;
	static String desig;
	static void create()
	{
		System.out.print("ENter Id : ");
		  id=sc.nextInt();

		System.out.print("ENter Name : ");
		 name= sc.next(); 

		System.out.print("ENter Age : ");
		 age =sc.nextInt();
		salary =90000;
		desig="Manager ";	
	}
	static void display()
	{
		if(name==null)
			System.out.println("You have not entered the details of employee Manager");
		else
		{
			System.out.println("***********************************");
			System.out.println(" ID : " + id );
			System.out.println("Name : " + name);
			System.out.println("Age : " + age );
			System.out.println("Salary : " + salary  );
			System.out.println("Designation : " + desig);
		}	
		
	}
	static void raiseSalary()
	{
		salary = 90000;
		salary=salary+30000;
		System.out.println("Raised salary of Manager"+salary);
	}
}
class Dev 
{
	
	/*Dev()
	{
		salary = 50000;
		desig=" Dev ";
	}*/
	static Scanner sc=new Scanner(System.in);
	static int id;
	static String name;
	static int age;
	static int salary ;
	static String desig;
	static void create()
	{
		System.out.print("ENter Id : ");
		  id=sc.nextInt();

		System.out.print("ENter Name : ");
		 name= sc.next(); 

		System.out.print("ENter Age : ");
		 age =sc.nextInt();
		salary =500000;
		desig="Dev ";	
	}
	static void display()
	{
		if(name==null)
			System.out.println("You have not entered details of employee Developer");
		else 
		{
			System.out.println("***********************************");
			System.out.println(" ID : " + id );
			System.out.println("Name : " + name);
			System.out.println("Age : " + age );
			System.out.println("Salary : " + salary  );
			System.out.println("Designation : " + desig);
		}
	}
	static void raiseSalary()
	{
		salary = 50000;
		salary=salary+20000;
		System.out.println("Raised salary of Dev"+salary);
	}
}
class Clerk 
{
	/*Clerk()
	{
		salary = 2000;
		desig=" Clerk ";
	}*/
	static Scanner sc=new Scanner(System.in);
	static int id;
	static String name;
	static int age;
	static int salary ;
	static String desig;
	static void create()
	{
		System.out.print("ENter Id : ");
		  id=sc.nextInt();

		System.out.print("ENter Name : ");
		 name= sc.next(); 

		System.out.print("ENter Age : ");
		 age =sc.nextInt();
		salary =2000;
		desig="Clerk ";	
	}
	static void display()
	{
		if(name==null)
			System.out.println("You have not entered details of employee Clerk");
		else 
		{
			System.out.println("***********************************");
			System.out.println(" ID : " + id );
			System.out.println("Name : " + name);
			System.out.println("Age : " + age );
			System.out.println("Salary : " + salary  );
			System.out.println("Designation : " + desig);
		}
	}
	static void raiseSalary()
	{
		salary = 2000;
		salary=salary+5000;
		System.out.println("Raised salary of Clerk"+salary);
	}
}
class Create1 
{
	/*Create1()
	{

	}*/
	void printer()
	{
		System.out.println("1. Create ");		
		System.out.println("2.display ");
		System.out.println("3. raise salary ");
		System.out.println("4. exit ");
	}
}
class Demo9
{
	public static void main(String args[])
	{

		/*System.out.println("Developer ");
		Dev d=new Dev();
		d.display();

		System.out.println(" Manager ");
		Manager m =new Manager();
		m.display();
	
		System.out.println(" Clerk ");
		Clerk c=new Clerk();
		c.display();
				
		System.out.println(" Tester ");
		Tester t =new Tester();
		t.display();*/
		Scanner sc=new Scanner(System.in);
		Create1 c1=new Create1();
		System.out.println("1. Create ");		
		System.out.println("2.display ");
		System.out.println("3. raise salary ");
		System.out.println("4. exit ");
		int n,n1;
		while(true)
		{
			
			n=sc.nextInt();
			switch(n)
			{
				case 1: System.out.println("Enter type of employee you want to create ");
						System.out.println("1. Enter the Developer Details");
						System.out.println("2. Enter the Manager Details ");
						System.out.println("3.Enter the Clerk Details");
						System.out.println("4.Enter the Tester Details");
						n1=sc.nextInt();
						switch(n1)
						{
							case 1: System.out.println("Enter the Details of Developer");
									Dev.create();
									c1.printer();
									break;
							case 2: System.out.println("Enter the  Details of Manager  ");
									Manager.create();
									c1.printer();
									break;
							case 3: System.out.println("Enter the Details of  Clerk ");
									Clerk. create();
									c1.printer();
									break;
							case 4: System.out.println("Enter the Details of  Tester ");
									Tester.create();
									c1.printer();
									break;
							case 5: System.exit(0);
									break;
							default:
						}
						break;
				case 2: System.out.println("Display all the members details of employees");
						Dev.display();
						Manager.display();
						Clerk.display();
						Tester.display();
						c1.printer();
						break;
				case 3: System.out.println("Raising the salary of all employees ");
						Dev.raiseSalary();
						Manager.raiseSalary();
						Clerk.raiseSalary();
						Tester.raiseSalary();
						c1.printer();
						break;
				case 4: System.out.println("Exiting from session");
						break;
				default: System.out.println("You entered wrong option"); 
							break;
			}
			if(n==4)
				break;
		}
	}
}