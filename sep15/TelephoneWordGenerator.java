import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TelephoneWordGenerator {

    private static final char[][] letters = {
            {},
            {}, 
            {'A', 'B', 'C'},
            {'D', 'E', 'F'},
            {'G', 'H', 'I'},
            {'J', 'K', 'L'},
            {'M', 'N', 'O'},
            {'P', 'R', 'S'},
            {'T', 'U', 'V'},
            {'W', 'X', 'Y'}
    };

    public static void main(String[] args) {
        String phoneNumber = "7382273"; 
        generateWords(phoneNumber);
    }

    public static void generateWords(String phoneNumber) {
        try {
            PrintStream output = new PrintStream(new File("word_combinations.txt"));
            generateWordsHelper(phoneNumber, 0, new StringBuilder(), output);
            output.close();
            System.out.println("Word combinations generated and saved to word_combinations.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void generateWordsHelper(String phoneNumber, int index, StringBuilder currentWord, PrintStream output) {
        if (index == phoneNumber.length()) {
            
            output.println(currentWord.toString());
        } else {
            int digit = phoneNumber.charAt(index) - '0';

            if (digit >= 2 && digit <= 9) {
                for (char letter : letters[digit]) {
                    
                    currentWord.append(letter);

                   
                    generateWordsHelper(phoneNumber, index + 1, currentWord, output);

                 
                    currentWord.deleteCharAt(currentWord.length() - 1);
                }
            } else {
               
                generateWordsHelper(phoneNumber, index + 1, currentWord, output);
            }
        }
    }
}


