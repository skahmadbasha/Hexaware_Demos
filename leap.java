import java.util.Scanner;
class Leap {
   public static void main(String[] args){
      int year;
      System.out.println("Enter an Year :: ");
      Scanner sc = new Scanner(System.in);
      year = sc.nextInt();

if (((year % 4 == 0)
{
   System.out.println("Specified year is a leap year");
}
 elseif (year % 100!= 0))
{
 System.out.println("Specified year is not a leap year");
}
 elseif(year%400 == 0))
{
 System.out.println("Specified year is a leap year");
}
   else{
        System.out.println("Specified year is not a leap year");
   }
}
}