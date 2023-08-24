import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        String phoneNumber = generatePhoneNumber();
        System.out.println("Random Phone Number: " + phoneNumber);
    }

    public static String generatePhoneNumber() {
        Random random = new Random();

        // Generate the first three digits (avoiding 8 and 9)
        int x1 = random.nextInt(8); // Range: 100-899
        int x2 = random.nextInt(8);
        int x3 = random.nextInt(8);
        // Generate the second set of three digits (not greater than 655)
        int secondThreeDigits = random.nextInt(656); // Range: 0-655

        // Generate the last four digits
        int lastFourDigits = random.nextInt(10000); // Range: 0-9999

        // Format the phone number
        return String.format("%01d%01d%01d-%03d-%04d", x1,x2,x3, secondThreeDigits, lastFourDigits);
    }
}
