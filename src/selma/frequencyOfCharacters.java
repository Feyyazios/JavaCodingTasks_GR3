package selma;

import jdk.dynalink.beans.StaticClass;

import java.util.HashMap;
import java.util.Map;

public class frequencyOfCharacters {

    /**
     * String - Frequency of Characters
     * <p>
     * Write a return method that can find the frequency of characters
     * <p>
     * Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */


    public static String frequencyOfChars(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        Map<Character, Integer> frequencyMap = new HashMap<>();


        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }


        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDDDDDD")); // Output: A3B2C1D2
    }
}

