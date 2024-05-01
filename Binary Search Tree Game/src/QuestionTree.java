import java.util.Scanner;

// QuestionTree class manages the binary tree and handles user interactions
public class QuestionTree {
    private Node root; // Root of the binary tree
    private Scanner scanner; // Scanner object for reading user input

    // Constructor initializes the scanner and sets up a default tree
    public QuestionTree() {
        scanner = new Scanner(System.in);
        root = new Node("computer"); // Default tree with one object
    }

    // Method to interact with the user and update the tree based on user input
    public void askQuestions() {
        if (yesTo("Do you want to read in the previous tree? (y/n)?")) {
            // Implement loading the tree from a file
        }

        do {
            System.out.println("Please think of an object for me to guess.");
            if (!askNode(root)) {
                System.out.println("What is the name of your object?");
                String object = scanner.nextLine();
                System.out.println("Please give me a yes/no question that distinguishes between your object and mine.");
                String question = scanner.nextLine();
                System.out.println("And what is the answer for your object? (y/n)?");
                boolean answer = yesTo(scanner.nextLine());

                // Update the tree with the new question and object
                Node newQuestion = new Node(question);
                Node newObject = new Node(object);
                if (answer) {
                    newQuestion.yesBranch = newObject;
                    newQuestion.noBranch = root;
                } else {
                    newQuestion.yesBranch = root;
                    newQuestion.noBranch = newObject;
                }
                root = newQuestion; // Update the root to the new question node
            }
        } while (yesTo("Do you want to go again? (y/n)?"));
    }

    // Helper method to navigate the tree and ask questions
    private boolean askNode(Node node) {
        if (node.yesBranch == null && node.noBranch == null) { // Check if it's an object node
            return yesTo("Would your object happen to be " + node.questionOrObject + "? (y/n)?");
        } else { // It's a question node
            if (yesTo(node.questionOrObject + "? (y/n)?")) {
                return askNode(node.yesBranch);
            } else {
                return askNode(node.noBranch);
            }
        }
    }

    // Method to prompt the user and validate 'y' or 'n' responses
    private boolean yesTo(String prompt) {
        System.out.println(prompt);
        while (true) {
            String response = scanner.nextLine().trim().toLowerCase();
            if (response.equals("y")) return true;
            if (response.equals("n")) return false;
            System.out.println("Invalid response. Please answer 'y' or 'n'.");
        }
    }

    // Main method to run the game
    public static void main(String[] args) {
        QuestionTree game = new QuestionTree();
        game.askQuestions();
    }
}