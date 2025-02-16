package Younes;

public class FrequencyOfChars {

    public static void main(String[] args) {

        System.out.println(frequencyOfChars("AAABBCDDJJFSHJHFJWJFJ"));
    }


    // the method that will return Frequency Of Characters as a String
    public static String frequencyOfChars(String str) {
        // Variable to store the final result
        String result = "";

        // Outer loop to iterate over each character in the input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the current character
            int count = 0; // Variable to count occurrences of the character

            // Check if the character is already counted to avoid duplication
            if (result.contains(String.valueOf(ch))) {
                continue; // Skip counting if already processed
            }

            // Inner loop to count occurrences of the current character in the string
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) { // If characters match, increase count
                    count++;
                }
            }

            // Add the character and its frequency count to the result string
            result += ch + String.valueOf(count);
        }

        // Return the final formatted string with character frequencies
        return result;
    }


}



