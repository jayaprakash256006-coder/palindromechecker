import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        // Iterate again through original string
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}