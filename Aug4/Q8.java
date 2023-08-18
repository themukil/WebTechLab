import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int count = 0;
        int temp = number;

        if (number == 0) {
            count = 1; // Special case for number 0
        } else {
            while (temp != 0) {
                temp /= 10;
                count++;
            }
        }

        System.out.println("Number of digits in " + number + " is: " + count);

        scanner.close();
    }
}
