import java.util.Random;

public class Q5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] sumFrequency = new int[11];  // Since the sums range from 2 to 12
        
        int totalRolls = 36000000;

        for (int i = 0; i < totalRolls; i++) {
            int die1 = random.nextInt(6) + 1;  // Generating values from 1 to 6
            int die2 = random.nextInt(6) + 1;

            int sum = die1 + die2 - 2;  // Subtract 2 to match array index (0-10)
            sumFrequency[sum]++;
        }

        System.out.println("Sum\tFrequency");

        for (int i = 0; i < sumFrequency.length; i++) {
            int sum = i + 2;  // Adding 2 to match actual sum value (2-12)
            System.out.println(sum + "\t" + sumFrequency[i]);
        }
    }
}
