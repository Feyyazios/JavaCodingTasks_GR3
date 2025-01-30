package Younes;

public class ReverseNegativeNumber {

        public static void main(String[] args) {
            // Calling the custom method and printing it
            System.out.println(reversedNegativeNumber(-35));
        }

        // A custom method that takes a negative number, reverses its digits and keeps it negative
        public static int reversedNegativeNumber(int number) {
            // Convert the number to positive number
            number *= -1;

            // Convert the integer to a string so we can manipulate its characters
            String numberStr = Integer.toString(number);

            // Create an empty string to store the reversed number
            String reversedStr = "";

            // Loop through the string from the last character to the first
            for (int i = numberStr.length() - 1; i >= 0; i--) {
                // Append each character in reverse order to the new string
                reversedStr += numberStr.charAt(i);
            }

            // Convert the reversed string back to an integer and make it negative again
            return Integer.parseInt(reversedStr) * -1;
        }
    }

