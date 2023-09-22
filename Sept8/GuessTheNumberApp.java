import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessTheNumberApp extends JFrame {
    private int numberToGuess;
    private JTextField guessField;
    private JButton submitButton;
    private JLabel statusLabel;
    private boolean gameActive;

    public GuessTheNumberApp() {
        setTitle("Guess the Number");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        Random random = new Random();
        numberToGuess = random.nextInt(1000) + 1;

        JLabel instructionLabel = new JLabel("I have a number between 1 and 1000. Can you guess my number?");
        guessField = new JTextField(5);
        submitButton = new JButton("Submit Guess");
        statusLabel = new JLabel("Please enter your first guess.");
        gameActive = true;

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gameActive) {
                    checkGuess();
                } else {
                    startNewGame();
                }
            }
        });

        add(instructionLabel);
        add(guessField);
        add(submitButton);
        add(statusLabel);
    }

    private void checkGuess() {
        try {
            int userGuess = Integer.parseInt(guessField.getText());

            if (userGuess == numberToGuess) {
                statusLabel.setText("Correct!");
                guessField.setEditable(false);
                submitButton.setText("New Game");
                gameActive = false;
            } else if (userGuess < numberToGuess) {
                statusLabel.setText("Too Low");
                guessField.setBackground(Color.BLUE);
            } else {
                statusLabel.setText("Too High");
                guessField.setBackground(Color.RED);
            }
        } catch (NumberFormatException ex) {
            statusLabel.setText("Invalid Input. Please enter a number.");
        }
    }

    private void startNewGame() {
        Random random = new Random();
        numberToGuess = random.nextInt(1000) + 1;
        guessField.setEditable(true);
        submitButton.setText("Submit Guess");
        guessField.setText("");
        statusLabel.setText("Please enter your first guess.");
        guessField.setBackground(Color.WHITE);
        gameActive = true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GuessTheNumberApp game = new GuessTheNumberApp();
                game.setVisible(true);
            }
        });
    }
}
