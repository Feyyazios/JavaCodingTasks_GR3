package Hilal;

public class ReverseNegativeNumbers {


    /*
    Reverse Negative Number
    Write a return method that can reverse digits
    of a negative number and return it as int in java
    input: -35  output: -53
    */

    /**
     * First we need to create a method to reverse negative number values,
     * Then we need to create our main method to take wanted result from  the given value,
     * So we need to create a condition just to deal with negative numbers
     * To switch integer value of digits for two digits numbers we must  divide the number by 10
     * Then we must concatenate two divided values
     * So here is the solution code...
     */







        public static int reverseNegative(int num) {
            // If the number is positive or zero, return it unchanged
            if (num >= 0) {
                return num;
            }

            int reversed = 0;

            // Work with the negative number directly
            while (num < 0) {
                int lastDigit = num % 10; // Extract the last digit (negative)
                reversed = reversed * 10 + lastDigit;
                num /= 10; // Remove the last digit
            }

            return reversed;
        }

        public static void main(String[] args) {
            System.out.println(reverseNegative(-35));  // Output: -53

        }



}