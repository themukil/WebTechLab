import java.util.Scanner;

public class Q1 {
  public static void main(String[] args) {
    Scanner ip = new Scanner(System.in); 
    int a, b, sum, diff, pro, quo;

    System.out.println("Enter the first number: ");
    a = ip.nextInt();
    System.out.println("Enter the second number: ");
    b = ip.nextInt();

    sum = a+b;
    diff = a-b;
    pro = a*b;
    quo = a/b;
    System.out.println("The sum of "+a+"and "+b+"is "+sum);
    System.out.println("The difference of "+a+"and "+b+"is "+diff);
    System.out.println("The product of "+a+"and "+b+"is "+pro);
    System.out.println("The quotient of "+a+"and "+b+"is "+quo);
    ip.close();
  }
}
