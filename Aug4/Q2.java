import java.util.Scanner;

public class Q2 {
  public static void main(String[] args) {
    Scanner ip = new Scanner(System.in); 
    int a, b;

    System.out.println("Enter the first number: ");
    a = ip.nextInt();
    System.out.println("Enter the second number: ");
    b = ip.nextInt();

    if(a>b){
        System.out.println(a+" is the greatest number");
    }
    else{
        System.out.println(b+" is the greatest number");
    }
    ip.close();
  }
}