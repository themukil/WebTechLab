import java.util.Scanner;

public class Q4 {
    public static int product(int... numbers) {
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of integers: ");
        int count = scanner.nextInt();
        
        int[] inputNumbers = new int[count];
        
        for (int i = 0; i < count; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            inputNumbers[i] = scanner.nextInt();
        }
        
        int calculatedProduct = product(inputNumbers);
        
        System.out.println("Product of the entered integers: " + calculatedProduct);
        
        scanner.close();
    }
}
