import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverterApp extends JFrame {
    private JTextField fahrenheitField;
    private JLabel celsiusLabel;

    public TemperatureConverterApp() {
        setTitle("Fahrenheit to Celsius Converter");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel fahrenheitLabel = new JLabel("Enter Fahrenheit temperature: ");
        fahrenheitField = new JTextField(10);
        JButton convertButton = new JButton("Convert");
        celsiusLabel = new JLabel("Celsius: ");

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertTemperature();
            }
        });

        add(fahrenheitLabel);
        add(fahrenheitField);
        add(convertButton);
        add(celsiusLabel);
    }

    private void convertTemperature() {
        try {
            double fahrenheit = Double.parseDouble(fahrenheitField.getText());
            double celsius = (fahrenheit - 32) * 5 / 9;
            celsiusLabel.setText("Celsius: " + String.format("%.2f", celsius));
        } catch (NumberFormatException ex) {
            celsiusLabel.setText("Celsius: Invalid Input");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TemperatureConverterApp converter = new TemperatureConverterApp();
                converter.setVisible(true);
            }
        });
    }
}
