package feyyaz;

public class FinraPrints {
    public static void main(String[] args) {
        printFinra();
    }

    public static void printFinra() {

        // Loop: The for loop iterates from 1 to 30.
        for (int i = 1; i <= 30; i++) {

            // Condition for FINRA: i % 3 == 0 && i % 5 == 0 checks if the number is divisible by both 3.
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA");
            } else if (i % 3 == 0) {

              //  Condition for FIN: i % 3 == 0 checks if the number is divisible by 3.
                System.out.print("FIN");
            } else if (i % 5 == 0) {

               // Condition for RA: i % 5 == 0 checks if the number is divisible by 5.
                System.out.print("RA");
            } else {

                // Default Case: If none of the above conditions are true, the number itself is printed.
                System.out.println(i);
            }
        }
    }
}
