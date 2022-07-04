import java.util.Scanner;
class Basha
{
Scanner sc=new Scanner(System.in);
String name;int age;int salary;String designation;
Basha()
{
System.out.println("Enter your name:");
String name=sc.next();

System.out.println("Enter your Age:");
int age=sc.nextInt();

System.out.println("Enter your Salary:");
int salary=sc.nextInt();

System.out.println("Enter your Designation:");
String designation=sc.next();
}
void display()
{
System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("Salary:"+salary);
System.out.println("Designation:"+designation);
}


}

class Ahmad1
{
public static void main(String args[])
{
 Basha b=new Basha();
b.display();
}
}

