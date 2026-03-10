import java.util.Scanner;

public class PalindromeCheckerApp {

    // Recursively checks whether a string is a palindrome
    private static boolean check(String s, int start, int end) {

        // Base case: if start >= end, all characters matched
        if (start >= end) {
            return true;
        }

        // If characters at start and end don't match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call moving inward
        return check(s, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();

        boolean result = check(input, 0, input.length() - 1);

        System.out.println("Is Palindrome? " + result);

        sc.close();
    }
}