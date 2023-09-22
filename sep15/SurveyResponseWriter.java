import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public class SurveyResponseWriter {

    public static void main(String[] args) {
        try {
            Formatter output = new Formatter("numbers.txt");
            Scanner input = new Scanner(System.in);

            System.out.println("Enter survey responses (enter -1 to finish):");

            int response;
            while (true) {
                response = input.nextInt();

                if (response == -1) {
                    break;
                }

                
                output.format("%d%n", response);
            }

          
            output.close();
            System.out.println("Survey responses have been written to numbers.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

