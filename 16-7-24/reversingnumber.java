

class reversingnumber {
    public static void main(String[] args)
    {
        int rem=0,n=2345,rev=0,i=0;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
           i++;
        }
        System.out.println(rev);
    }
}