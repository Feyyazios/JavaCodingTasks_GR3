package selma;

public class reverseNegativeNumber {

    public static int reverseNegative(int num) {
        // If the number is positive or zero, return it unchanged
        if (num >= 0) {
            return num;

        }

        int reversed = 0;
        // Work with the negative number directly
        while ( num < 0 ) {

            int lastDigit = num % 10; // Extract the last digit (negative)
            reversed = reversed * 10 + lastDigit;
            num /= 10; // Remove the last digit

        }
        return reversed;

    }
    public static void main(String[] args) {
        //  System.out.println(reverseNegative(-35));  // Output: -53
        // System.out.println(reverseNegative(-120));
        System.out.println(reverseNegative(-1002));
    }

}
