import java.util.Scanner;
class Sample
{
    public  static boolean ispalindrome(int n)
    {
        int temp=n;
        int r,sum=0;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(temp==sum)
          return true;
         else
           return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,X[],count=0;
        n=sc.nextInt();
        X=new int[n];
        for(int i=0;i<n;i++)
        X[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(Sample.ispalindrome(X[i]))
            count++;
        }
        System.out.println(count);
        sc.close();
        }
    }

