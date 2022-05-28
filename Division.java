import java.util.Scanner;
class simple_calculator1
{
   public static void main(String args[])
{
      int A1,B1;
      int Division;
     
      Scanner sc=new Scanner(System.in);
      A1=sc.nextInt();
      B1=sc.nextInt();
      Division=A1/B1;      
      System.out.println("" +Division);
}
}