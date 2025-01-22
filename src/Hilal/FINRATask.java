package Hilal;

public class FINRATask {
     /*
Write a function that prints out the numbers from 1 to 30
but for numbers that are a multiple of 3,
 print "FIN" instead of the number,
 and for numbers that are a multiple of 5,
 print "RA" instead of the number.
 For numbers that are a multiple of both 3 and 5,
 print "FINRA" instead of the number.
 */

    public static void main(String[] args) {

        // Calling the printFinra method to print numbers and corresponding outputs
        printFinra();

    }

    // printFinra method : Prints numbers from 1 to 30, applying specific rules.

    public static void printFinra() {
        // loop block of code inside it runs 30 times (once for each number from 1 to 30).
        for (int i = 1; i <= 30; i++) {
            // condition: if the number is divisible by both 3 and 5.
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
                // condition: if the number is divisible by 3.
            } else if (i % 3 == 0) {
                System.out.println("FIN");
                // condition: if the number is divisible by 5.
            } else if (i % 5 == 0) {
                System.out.println("RA");
                // If none of the above conditions are true.
            } else {
                System.out.println(i);
            }
        }
    }




}
