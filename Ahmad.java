import java.util.Scanner;
class Basha
{
Scanner sc=new Scanner(System.in);
Basha()
{
System.out.println("Enter your name:");
String name=sc.next();

System.out.println("Enter your Age:");
int age=sc.nextInt();

System.out.println("Enter yourSalary:");
int salary=sc.nextInt();

System.out.println("Enter your Designation:");
String designation=sc.next();

System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("Salary:"+salary);
System.out.println("Designation:"+designation);
}
}

class Ahmad
{
public static void main(String args[])
{
 Basha b=new Basha();
}
}

