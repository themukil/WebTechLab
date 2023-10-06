import java.util.LinkedList;
import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        // Create a LinkedList to store the random integers
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Create a Random object to generate random numbers
        Random random = new Random();

        // Insert 25 random integers from 0 to 100
        for (int i = 0; i < 25; i++) {
            int randomNumber = random.nextInt(101); // Generates random number between 0 and 100
            linkedList.add(randomNumber);
        }

        // Sort the elements in ascending order
        linkedList.sort(null);

        // Calculate the sum of the elements
        int sum = 0;
        for (Integer number : linkedList) {
            sum += number;
        }

        // Calculate the average of the elements
        double average = (double) sum / linkedList.size();

        // Print the sorted elements, sum, and average
        System.out.println("Sorted Elements: " + linkedList);
        System.out.println("Sum of Elements: " + sum);
        System.out.println("Average of Elements: " + average);
    }
}
