// Node class represents each node in the binary tree, which can be a question or an object (answer).
class Node {
    String questionOrObject; // Stores the question or the object name
    Node yesBranch; // Pointer to the subtree for a "yes" answer
    Node noBranch; // Pointer to the subtree for a "no" answer

    // Constructor to initialize the node with a question or an object
    Node(String questionOrObject) {
        this.questionOrObject = questionOrObject;
    }
}