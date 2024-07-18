import java util.*;
class SkippingKnumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of M: ");
        int m = scanner.nextInt();
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of K: ");
        int k = scanner.nextInt();
        for (int i = m; i <= n; i += k) {
            System.out.print(i + " ");
        }

    }
}