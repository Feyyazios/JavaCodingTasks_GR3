package muzaffar;

public class RemoveDuplicates {
    public static String removeDuplicates(String string) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);

            // I'm checking  if char is already added
            if (result.indexOf(String.valueOf(character)) == -1){
                result.append(character);
            }
        }

        return result.toString();

    }

    public static void main(String[] args) {
        String duplicated = "AAABBBCCC";
        String result = removeDuplicates(duplicated);
        System.out.println("result = " + result);


    }




}
