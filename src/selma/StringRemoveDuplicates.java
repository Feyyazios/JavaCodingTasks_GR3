package selma;

public class StringRemoveDuplicates {

    /**
     * Method to remove duplicate characters from the given string.
     * @param str The input string from which duplicate characters will be removed.
     * @return A string with duplicate characters removed.
     */
    public static String removeDuplicateCharacters(String str) {
        String result = ""; // Initialize an empty string to store the result

        // Loop through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the current character

            // Check if the character is already in the result string
            if (result.indexOf(ch) == -1) {
                result += ch; // Append the character if it's not a duplicate
            }
        }
        return result; // Return the modified string without duplicates
    }

    public static void main(String[] args) {
        String input = "AABCCCDDDEEEE11122333"; // Example input string
        String output = removeDuplicateCharacters(input); // Call the method

        // Print the original and modified strings
        System.out.println("Original String: " + input);
        System.out.println("Unique String: " + output);
    }
}


