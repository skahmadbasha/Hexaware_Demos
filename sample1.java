abstract class A
{
 abstract void Apple();
}

abstract class B extends A
{

 void Apple()
{
 System.out.println("This is Apple");
}
abstract void BEC();

}

class C extends B
{
void BEC()
{
 System.out.println("Overriding");
}
}

class sample1
{
public static void main(String args[])
{
 C c=new C();
 c.BEC();
c.Apple();
}
}