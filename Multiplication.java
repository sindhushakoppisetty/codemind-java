import java.util.Scanner;
class simple_calculator
{
   public static void main(String args[])
  {
      int A,B ;
      int Multiply;
      Scanner sc=new Scanner(System.in);
      A=sc.nextInt();
      B=sc.nextInt();
      Multiply =A*B;
      System.out.println("" +Multiply);
  }
}