package nurten;

public class RemoveDuplicates {

    /***
     * Write a return method can remove the duplicated values from String
     * @param args
     */

    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAABBBCCCDDEEEEFFFF"));     // output: ABCDEF
    }


    public static String removeDuplicates(String s) {
        String result = "";                        // Starting with an empty string

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);                 // Getting each character from the string

            if (result.indexOf(c) == -1) {        // If the character is not already in 'result', adding it
                result += c;
            }
        }

        return result;                            // Returning the final string with unique characters
    }

}
