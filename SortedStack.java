import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 * A Java program that reads a list of integers from standard input,
 * stores them in a Stack, and sorts them in ascending order.
 * 
 * This program is a maintenance update from the SortedLinkedList project adapting the previous
 * LinkedList implementation to use a Stack while reusing existing logic rather than rewriting from scratch.
 * 
 * Usage:
 * Run the program and enter integers separated by spaces or new lines.
 * Press Ctrl+D (Linux/macOS) or Ctrl+Z (Windows) followed by Enter to end input.
 * 
 * Compilation:
 * javac SortedStack.java
 * 
 * Execution:
 * java SortedStack
 * 
 * Javadoc Generation:
 * javadoc -d doc SortedStack.java
 * 
 * @author Kyle McDonald
 * @version 1.2
 * @since 2.18.25
 */
public class SortedStack {

    /**
     * Reads a list of integers from user input and stores integers into a stack. 
     * The stack is then sorted and prints the sorted integers.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> numbers = new Stack<>();

        System.out.println("Enter integers (Press Ctrl+D to stop input on Linux/macOS, Ctrl+Z on Windows):");

        // Read integers from the input
        while (scanner.hasNextInt()) {
            numbers.push(scanner.nextInt());
        }
        scanner.close();

        // Sort the stack in ascending order
        Collections.sort(numbers);

        // Print the sorted stack
        System.out.println("Sorted Stack: " + numbers);
    }
}
