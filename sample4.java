class A
{
 int a =100;
 int b=200;

final void abc()
{
 System.out.println("This is class A method");
}

}

class B extends A
{
 final int b=500;
void bcd()
{
 System.out.println("This is class B method");
}

}

class sample4{
public static void main(String args[])
{
 B b1=new B();
 b1.abc();
 b1.bcd();
System.out.println(b1.b);

}
}
