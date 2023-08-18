import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        if (radius <= 0) {
            System.out.println("Invalid input. Please enter a positive value for radius.");
            return;
        }

        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        double diameter = 2 * radius;

        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter of the circle: " + perimeter);
        System.out.println("Diameter of the circle: " + diameter);

        scanner.close();
    }
}
