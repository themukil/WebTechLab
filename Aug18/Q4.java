import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        double result = Math.exp(num);
        System.out.printf("e^%d = %.6f%n", num, result);
      
        scanner.close();
        }
    }

