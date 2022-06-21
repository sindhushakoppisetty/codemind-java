import java.util.Scanner;
class temp
{
    public static void main(String args[])
    {
        double F,C;
        Scanner sc=new Scanner(System.in);
        C=sc.nextDouble();
        F=32+(C*9/5);
        System.out.printf("%.2f",F);
    }
}