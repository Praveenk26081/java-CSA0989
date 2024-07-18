import java.util.*;
class vote
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
            int age;
            System.out.println("Enter the age : ");
            age=sc.nextInt();
        {
            if(age>=18)
            {
                int x=age-18;
                System.out.println("you are elligebel for vote , you can vote before :"+x);
            }
            else 
            {
                int y=age-18;
                System.out.println("you are not elligebel for vote , you can vote after :"+y);   
            }
        }   
    }
}