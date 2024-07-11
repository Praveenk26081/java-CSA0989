import java.util.*;
class Reminder
{
  public static void main(String args[])
 {
 Scanner sc=new Scanner (System.in);
int r,q,n1,n2;
System.out.println("Enter the number 1:");
n1=sc.nextInt();
System.out.println("Enter the number 2:");
n2=sc.nextInt();
r=n1%n2;
q=n1/n2;
System.out.println("Reminder :"+r);
System.out.println("quotient :"+q);
  }
}