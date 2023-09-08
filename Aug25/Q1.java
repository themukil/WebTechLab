import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] salaryRanges = new int[9]; // Array to store counters for each salary range

        int grossSales;
        System.out.print("Enter gross sales for salesperson (-1 to exit): ");
        grossSales = scanner.nextInt();

        while (grossSales != -1) {
            int earnings = 200 + (int) (0.09 * grossSales);

            if (earnings >= 200 && earnings <= 299) {
                salaryRanges[0]++;
            } else if (earnings >= 300 && earnings <= 399) {
                salaryRanges[1]++;
            } else if (earnings >= 400 && earnings <= 499) {
                salaryRanges[2]++;
            } else if (earnings >= 500 && earnings <= 599) {
                salaryRanges[3]++;
            } else if (earnings >= 600 && earnings <= 699) {
                salaryRanges[4]++;
            } else if (earnings >= 700 && earnings <= 799) {
                salaryRanges[5]++;
            } else if (earnings >= 800 && earnings <= 899) {
                salaryRanges[6]++;
            } else if (earnings >= 900 && earnings <= 999) {
                salaryRanges[7]++;
            } else {
                salaryRanges[8]++;
            }

            System.out.print("Enter gross sales for salesperson (-1 to exit): ");
            grossSales = scanner.nextInt();
        }

        System.out.println("\nSalary Range\tNumber of Salespeople");
        System.out.println("$200-299\t\t" + salaryRanges[0]);
        System.out.println("$300-399\t\t" + salaryRanges[1]);
        System.out.println("$400-499\t\t" + salaryRanges[2]);
        System.out.println("$500-599\t\t" + salaryRanges[3]);
        System.out.println("$600-699\t\t" + salaryRanges[4]);
        System.out.println("$700-799\t\t" + salaryRanges[5]);
        System.out.println("$800-899\t\t" + salaryRanges[6]);
        System.out.println("$900-999\t\t" + salaryRanges[7]);
        System.out.println("$1000 and over\t" + salaryRanges[8]);

        scanner.close();
    }
}
