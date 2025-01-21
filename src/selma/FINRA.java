package selma;

public class FINRA {

    public static void main(String[] args) {

        finra(55);


    }

    public static void finra(int number) {

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FINRA");
        } else if (number % 5 == 0) {
            System.out.println("RA");
        } else if (number % 3 == 0) {
            System.out.println("FIN");
        } else {
            System.out.println(number);

        }
    }
}

/*
 For a number that is a multiple of 3, print "FIN" instead of the number.
        For a number that is a multiple of 5, print "RA" instead of the number.
        For a number that is a multiple of both 3 and 5, print "FINRA" instead of the number.

        Example:
        number = 15

        Output:
        FINRA
       */



