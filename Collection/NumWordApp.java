import java.util.*;

public class NumWordApp {
    public static void Convert(int n) {
        // Array to store digit words in reverse order
        String[] words = new String[]{"Zero", "One", "Two", "Three", "Four", "Five",
                                     "Six", "Seven", "Eight", "Nine"};

        // Stack to store words in correct order
        Stack<String> wordStack = new Stack<>();

        // Extract digits and push words onto stack
        while (n > 0) {
            int digit = n % 10;
            wordStack.push(words[digit]);
            n /= 10;
        }

        // Print words in correct order from stack
        while (!wordStack.isEmpty()) {
            System.out.print(wordStack.pop() + " ");
        }
        System.out.println(); // Add newline after printing
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        Convert(n);
        sc.close();
    }
}
