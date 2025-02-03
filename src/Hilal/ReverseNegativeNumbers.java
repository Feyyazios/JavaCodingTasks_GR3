package Hilal;

public class ReverseNegativeNumbers {


    /*
    Reverse Negative Number

Write a return method that can reverse digits of a negative number and return it as int in java
input: -35  output: -53

     */

    public class ReverseNegativeNumber {

        public static int reverseNegative(int num) {
            // Check if the input is negative; if not, throw an exception
            if (num >= 0) {
                throw new IllegalArgumentException("Input must be a negative number");
            }

            // Convert the number to positive to make processing easier
            int reversed = 0;
            num = Math.abs(num); // Math.abs(-35) -> 35

            // Loop to reverse the digits
            while (num > 0) {
                // Extract the last digit and add it to the reversed number
                reversed = reversed * 10 + num % 10;
                // Remove the last digit from the number
                num /= 10;
            }

            // Restore the negative sign before returning the reversed number
            return -reversed;
        }

        public static void main(String[] args) {
            // Test cases
            System.out.println(reverseNegative(-35));  // Output: -53
            System.out.println(reverseNegative(-120)); // Output: -21
        }
    }




}
