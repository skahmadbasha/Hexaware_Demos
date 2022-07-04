interface I
{
int x=100;
void add();
void sub();
}

interface J
{
int y=200;
void mul();
void div();
}

interface K extends I,J
{

}

class Cal implements K
{

public void sub()
{
System.out.println(I.x-J.y);
}
public void add()
{
System.out.println(I.x+J.y);
}
public void mul()
{
System.out.println(I.x*J.y);
}
 public void div()
{
System.out.println(I.x/J.y);
}

}

class sample3
{

public static void main(String args[])
{
 Cal c=new Cal();
 I i=c;
 i.add();
 i.sub();
 System.out.println("**********");
 J j=c;
 j.mul();
 j.div();
 System.out.println("**********");
 K k=c;
 k.add();
 k.sub();
 k.mul();
 k.div();


}

} 

