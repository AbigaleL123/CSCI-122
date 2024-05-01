import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



// QuestionTreeGUI class manages the binary tree and handles user interactions through a graphical interface
public class QuestionTreeGUI extends JFrame {
    private Node root; // Reference to the root of the binary tree
    private Node currentNode; // Current node in the tree during the game
    private JLabel questionLabel; // Label to display the current question or object

    // Constructor to set up the GUI components and initialize the game
    public QuestionTreeGUI(Node root) {
        super("Guessing Game");
        this.root = root;
        currentNode = root; // Start the game at the root node
        questionLabel = new JLabel("Is it a " + currentNode.questionOrObject + "?", SwingConstants.CENTER);

        // Create buttons for user responses
        JButton yesButton = new JButton("Yes");
        JButton noButton = new JButton("No");

        // Add action listeners to buttons to handle user responses
        yesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (currentNode.yesBranch != null) {
                    currentNode = currentNode.yesBranch; // Move to the yes branch
                    questionLabel.setText("Is it a " + currentNode.questionOrObject + "?"); // Update the question
                } else {
                    JOptionPane.showMessageDialog(null, "Correct! It is a " + currentNode.questionOrObject + "!");
                    resetGame(); // Reset the game after a correct guess
                }
            }
        });

        noButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (currentNode.noBranch != null) {
                    currentNode = currentNode.noBranch; // Move to the no branch
                    questionLabel.setText("Is it a " + currentNode.questionOrObject + "?"); // Update the question
                } else {
                    JOptionPane.showMessageDialog(null, "Hmm, I don't know what it is. Please help me learn.");
                    // Here you could add functionality to expand the tree with user input
                    resetGame(); // Reset the game after an incorrect guess
                }
            }
        });

        // Layout configuration for the GUI
        setLayout(new BorderLayout());
        add(questionLabel, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(yesButton);
        buttonPanel.add(noButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Window settings
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    // Method to reset the game to the initial state
    private void resetGame() {
        currentNode = root; // Reset to the root node
        questionLabel.setText("Is it a " + currentNode.questionOrObject + "?"); // Update the question label
    }

    // Main method to run the game
    public static void main(String[] args) {
        Node root = new Node("Is it an electronic device?");
        root.yesBranch = new Node("computer");
        root.noBranch = new Node("apple");
        new QuestionTreeGUI(root).setVisible(true);
    }
}