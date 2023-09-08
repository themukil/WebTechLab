import javax.swing.*;
import java.util.Scanner;

public class Q12_12{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        JFrame f = new JFrame("Temperature conversion");
        JTextField t1;
        t1=new JTextField("Enter the Temperature in Farenheit...");  
        t1.setBounds(50,100, 200,30); 
        f.add(t1);
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);
    }
}
