package Ifrat;

public class FINRA {
    public static void main(String[] args) {
        for (int i = 1; i < 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA");
            } else if (i % 3 == 0) {
                System.out.print("FIN");
            } else if (i % 5 == 0) {
                System.out.print("RA");
            } else {
                System.out.print(i);
            }
        }

        int a = 1;
        while (a <= 30) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.print("FINRA");
            } else if (a % 3 == 0) {
                System.out.print("FIN");
            } else if (a % 5 == 0) {
                System.out.print("RA");
            } else {
                System.out.print(a);
            }
            a++;
        }

        int b = 1;
        do {
            if (b % 3 == 0 && b % 5 == 0) {
                System.out.print("FINRA");
            } else if (b % 3 == 0) {
                System.out.print("FIN");
            } else if (b % 5 == 0) {
                System.out.print("RA");
            } else {
                System.out.print(b);
            }
            b++;
        } while (b <= 30);
    }


}

//FINRA:
// Write a function that prints out the numbers
// from 1 to 30 but for numbers that are a multiple
// of 3, print "FIN" instead of the number, and for
// numbers that are a multiple of 5, print "RA" instead of the number.
// For numbers that are a multiple of both 3 and 5, print "FINRA" instead of the number.