import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight (in kilograms): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();

        if (weight <= 0 || height <= 0) {
            System.out.println("Invalid input. Weight and height must be positive values.");
            return;
        }

        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("You are classified as 'Slim'.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("You are classified as 'Normal'.");
        } else {
            System.out.println("You are classified as 'Obese'.");
        }

        scanner.close();
    }
}
