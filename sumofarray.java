import java.util.*;
public class sumofarray{
  public static void main(String[] args) 
  {
   int a[]=new int[5];
  Scanner sc=new Scanner (System.in);
  int i,sum=0;
 System.out.print("Enter the array elements:");
for(i=0;i<5;i++)
{
  a[i]=sc.nextInt();
}
 System.out.print("The elements in the array is :");
  for(i=0;i<5;i++)
   {
sum=sum+a[i];
}
    System.out.print("The sum of the array is :"+sum);
}
}
