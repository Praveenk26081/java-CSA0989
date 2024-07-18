

class pallindrome {
    public static void main(String[] args)
    {
        int rem=0,n=121,rev=0,i=0,tem=n;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
           i++;
        }
        if(tem==rev)
        {
        System.out.println("The number is pallindrome");}
        else{
            System.out.println("The number is not a pallindrome");
        }
    }
}