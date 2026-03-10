import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        // Push characters to stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare with original string
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();

        boolean result = check(input);

        System.out.println("Is Palindrome? " + result);

        sc.close();
    }
}