import java.util.Scanner;

public class VowelChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int vowelCount = 0;
        boolean hasVowels = false;

        // Convert string to lowercase for case-insensitive check
        inputString = inputString.toLowerCase();

        for (char character : inputString.toCharArray()) {
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                vowelCount++;
                hasVowels = true;
            }
        }

        String message;
        if (hasVowels) {
            message = "The string contains " + vowelCount + " vowel(s).";
        } else {
            message = "The string does not contain any vowels.";
        }

        System.out.println(message);

        scanner.close();
    }
}
