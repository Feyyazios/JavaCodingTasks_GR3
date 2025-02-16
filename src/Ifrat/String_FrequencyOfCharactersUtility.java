package Ifrat;

public class String_FrequencyOfCharactersUtility {


    public static String frequencyOfChars(String str) {
        //Step 1: Create an array of integer called freq with a size of 256 (ACSII 0-255)
        /*
        Initially, all values in the array are set to 0. Each time a character appears in the string,
        the corresponding index in the freq array is incremented.
        If you were processing a string and encountered the character with ASCII value 65 (the letter 'A'),
        you could increment the value at index 65 in this array to track how often 'A' appears.
        */
        int[] freq = new int[256];
        //Step 2: Create object called result. Using StringBuilder here is forString manipulation

        StringBuilder result = new StringBuilder();

        // Step 3: Count frequency of each character
        // This loop iterates through the string str character by character.
        //str.charAt(i) returns the character at index i of the string.
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Step 4: Build the result string after we’ve counted the frequencies.
        for (int i = 0; i < str.length(); i++) {

            // Step 5:Here we get the character at index i from the string str and store it in a variable called currentChar.
            char currentChar = str.charAt(i);

            // Step 6:
            if (freq[currentChar] > 0) {

                // Step 7: Append character and frequency of that character
                result.append(currentChar).append(freq[currentChar]);
                // Step 8: resets the frequency of the current character in the freq array to 0.
                freq[currentChar] = 0;
            }
        }

        return result.toString(); // Step 9
    }

    //Write a return method that can find the frequency of characters
    //         Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2

}
