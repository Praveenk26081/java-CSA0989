class sumofdigit
{
  public static void main(String[] args) 
  {
    int n=1876;
    int i=0,sum=0,rem;
    while(n!=0){
    rem=n%10;
    sum=sum+rem;
    n=n/10;
    i++;
    
  }
  System.out.println("The sum of the digites is:"+sum);
  }
}
