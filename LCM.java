import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        {
            int a,b,i,min,gcd=0,lcm;
            a=sc.nextInt();
            b=sc.nextInt();
            min=(a>b)?a:b;
            for(i=1;i<=min;i++)
            {
                if(a%i==0 && b%i==0)
                {
                    gcd=i;
                }
            }
            lcm=(a*b)/gcd;
            System.out.printf("%d",lcm);
        }
    }
}