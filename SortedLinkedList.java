import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * A Java program that reads a list of integers from standard input,
 * stores them in a LinkedList, and sorts them in ascending order.
 * 
 * This program uses the Java Collections Framework and follows best 
 * practices for command-line execution.
 * 
 * Usage:
 * Run the program and enter integers separated by spaces or new lines.
 * Press Ctrl+D (Linux/macOS) or Ctrl+Z (Windows) followed by Enter to end input.
 * 
 * Compilation:
 * javac SortedLinkedList.java
 * 
 * Execution:
 * java SortedLinkedList
 * 
 * Javadoc Generation:
 * javadoc -d doc SortedLinkedList.java
 * 
 * @author Kyle McDonald
 * @version 1.0
 * @since 2.11.25
 */
public class SortedLinkedList {

    /**
     * Reads a list of integers from standard input, sorts them, and prints the sorted list.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new LinkedList<>();

        System.out.println("Enter integers (Press Ctrl+D to stop input on Linux/macOS, Ctrl+Z on Windows):");

        // Read integers from the input
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }
        scanner.close();

        // Sort the list in ascending order
        Collections.sort(numbers);

        // Print the sorted numbers
        System.out.println("Sorted List: " + numbers);
    }
}
