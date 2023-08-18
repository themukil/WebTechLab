import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive value for n.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();

            if (num > largest) {
                largest = num;
            }

            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);

        scanner.close();
    }
}

