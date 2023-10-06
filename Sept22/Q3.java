import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            Set<Integer> primeFactors = findPrimeFactors(number);
            System.out.println(number + " is not a prime number.");
            System.out.println("Unique prime factors: " + primeFactors);
        }
    }

    // Check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Find unique prime factors of a number
    public static Set<Integer> findPrimeFactors(int num) {
        Set<Integer> primeFactors = new HashSet<>();
        int n = num;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            while (n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }

        if (n > 1) {
            primeFactors.add(n);
        }

        return primeFactors;
    }
}
