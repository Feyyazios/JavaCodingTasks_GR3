package feyyaz;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChars {

    public static void main(String[] args) {
        // Testing the method with a sample input
        System.out.println(getCharacterFrequency("XYYZZZAAAB"));
    }

    /**
     * Computes the frequency of each unique character in the given string.
     * @param input The string to be analyzed.
     * @return A string representation of each character followed by its frequency.
     */
    public static String getCharacterFrequency(String input) {
        // Using a HashMap to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count occurrences of each character
        for (char ch : input.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Build result string
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }
}
