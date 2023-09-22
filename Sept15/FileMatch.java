import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public class FileMatch {
    public static void main(String[] args) {
        try (Scanner oldMast = new Scanner(new File("oldmast.txt"));
             Scanner trans = new Scanner(new File("trans.txt"));
             Formatter newMast = new Formatter("newmast.txt");
             Formatter log = new Formatter("log.txt")) {

            while (oldMast.hasNext()) {
            
                int accountNumber = oldMast.nextInt();
                String firstName = oldMast.next();
                String lastName = oldMast.next();
                double balance = oldMast.nextDouble();

                while (trans.hasNext()) {
                    int transAccountNumber = trans.nextInt();
                    double amount = trans.nextDouble();

                    if (accountNumber == transAccountNumber) {
                     
                        balance += amount;
                    } else {
                     
                        log.format("Unmatched transaction record for account number %d%n", transAccountNumber);
                    }
                }

                newMast.format("%d %s %s %.2f%n", accountNumber, firstName, lastName, balance);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

