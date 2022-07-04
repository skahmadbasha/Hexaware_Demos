class A
{
A()//constructor
{
System.out.println("A class");
}
void ABC()
{
System.out.println("This is ABC method");
}
}


abstract class B
{
B()//constructor
{
System.out.println("B class");
}
void XYZ()
{
System.out.println("This is XYZ method");
}
abstract void abs();
}


class sample
{
public static void main(String args[])
{
	A a=new A();
	a.ABC();
	//B b=new B();
	//b.XYZ();
}
}