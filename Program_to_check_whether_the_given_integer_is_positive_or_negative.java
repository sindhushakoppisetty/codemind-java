import java.util.Scanner;
class Positive
{
    public static void main(String args[])
    {
        int x;
        Scanner sc =new Scanner(System.in);
        x=sc.nextInt();
        if(x>0)
        System.out.println("Positive Number");
        else
         System.out.println("Negative Number");
    }
}