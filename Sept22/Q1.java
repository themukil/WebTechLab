import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        String sentence;
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter the sentence: ");
        sentence = ip.nextLine();

        // Remove punctuation and convert to lowercase
        String cleanSentence = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split the sentence into words
        String[] words = cleanSentence.split("\\s+");

        // Sort the words to group duplicates together
        Arrays.sort(words);

        int count = 0;

        // Iterate through the sorted words and count duplicates
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].equals(words[i + 1])) {
                count++;
                // Skip duplicate words to avoid double counting
                while (i < words.length - 1 && words[i].equals(words[i + 1])) {
                    i++;
                }
            }
        }

        // Print the number of duplicate words
        System.out.println("Number of duplicate words: " + count);
    }
}
