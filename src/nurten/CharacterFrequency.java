package nurten;

public class CharacterFrequency {

    /***
     *Write a return method that can find the frequency of characters*
         Ex:frequencyOfChars("AAABBCDD") ==> A3B2C1D2
     * @param args
     */

    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD")); // Output: A3B2C1D2
    }

    public static String frequencyOfChars(String str) {
            String result = ""; // Store the final output

            while (!str.isEmpty()) {
                char ch = str.charAt(0); // Take the first character
                int count = 0;

                // Count occurrences of the character
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == ch) {
                        count++;
                    }
                }

                // Append character and its frequency to result
                result += ch + String.valueOf(count);

                // Remove all occurrences of the counted character
                str = str.replace(String.valueOf(ch), "");
            }

            return result;
    }

}
