import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverterAdvanced extends JFrame {
    private JTextField temperatureField;
    private JLabel resultLabel;

    public TemperatureConverterAdvanced() {
        setTitle("Temperature Converter (Advanced)");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel inputLabel = new JLabel("Enter Temperature:");
        temperatureField = new JTextField(10);
        JComboBox<String> fromScale = new JComboBox<>(new String[]{"Fahrenheit", "Celsius", "Kelvin"});
        JComboBox<String> toScale = new JComboBox<>(new String[]{"Fahrenheit", "Celsius", "Kelvin"});
        JButton convertButton = new JButton("Convert");
        resultLabel = new JLabel("Result: ");

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performConversion(
                    Double.parseDouble(temperatureField.getText()),
                    fromScale.getSelectedItem().toString(),
                    toScale.getSelectedItem().toString()
                );
            }
        });

        add(inputLabel);
        add(temperatureField);
        add(fromScale);
        add(new JLabel("to"));
        add(toScale);
        add(convertButton);
        add(resultLabel);
    }

    private void performConversion(double value, String fromScale, String toScale) {
        double result = 0.0;

        if (fromScale.equals("Fahrenheit")) {
            if (toScale.equals("Celsius")) {
                result = convertFahrenheitToCelsius(value);
            } else if (toScale.equals("Kelvin")) {
                result = convertFahrenheitToKelvin(value);
            }
        } else if (fromScale.equals("Celsius")) {
            if (toScale.equals("Fahrenheit")) {
                result = convertCelsiusToFahrenheit(value);
            } else if (toScale.equals("Kelvin")) {
                result = convertCelsiusToKelvin(value);
            }
        } else if (fromScale.equals("Kelvin")) {
            if (toScale.equals("Fahrenheit")) {
                result = convertKelvinToFahrenheit(value);
            } else if (toScale.equals("Celsius")) {
                result = convertKelvinToCelsius(value);
            }
        }

        resultLabel.setText("Result: " + String.format("%.2f", result) + " " + toScale);
    }

    private double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private double convertFahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    private double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private double convertCelsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    private double convertKelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    private double convertKelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TemperatureConverterAdvanced converter = new TemperatureConverterAdvanced();
                converter.setVisible(true);
            }
        });
    }
}
