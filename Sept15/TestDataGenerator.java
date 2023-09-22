import java.io.*;
import java.util.Formatter;
import java.util.Random;

public class TestDataGenerator {
    public static void main(String[] args) {
        Random random = new Random();

        try (Formatter oldMastFile = new Formatter("oldmast.txt");
             Formatter transFile = new Formatter("trans.txt")) {

            for (int i = 100; i <= 900; i += 100) {
                String firstName = "First" + i;
                String lastName = "Last" + i;
                double balance = random.nextDouble() * 1000;
                oldMastFile.format("%d %s %s %.2f%n", i, firstName, lastName, balance);

                int accountNumber = i;
                double amount = random.nextDouble() * 100;
                transFile.format("%d %.2f%n", accountNumber, amount);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

