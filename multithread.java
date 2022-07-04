class A extends Thread
{
public void run()
{
try{

for(int i=0;i<5;i++)
{
System.out.println("I:"+i);
Thread.sleep(1000);
}
}
catch(InterruptedException ie)
{}
}
}


class B extends Thread
{
public void run()
{
try{

for(int j=0;j<5;j++)
{
System.out.println("J:"+j);
Thread.sleep(1000);
}
}
catch(InterruptedException ie)
{}
}
}

class multithread 
{
public static void main( String args[])
{
A a=new A();
B b=new B();

a.start();
b.start();

}
}