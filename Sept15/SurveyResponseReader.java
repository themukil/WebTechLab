import java.io.*;
import java.util.Scanner;

public class SurveyResponseReader {

    public static void main(String[] args) {
        try {
           
            Scanner inputFile = new Scanner(new File("numbers.txt"));
            PrintWriter outputFile = new PrintWriter("out.txt");

            System.out.println("Survey Responses:");

            while (inputFile.hasNext()) {
                int response = inputFile.nextInt();

                
                System.out.println(response);
                outputFile.println(response);
            }

         
            inputFile.close();
            outputFile.close();
            System.out.println("Survey responses have been read and written to out.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

