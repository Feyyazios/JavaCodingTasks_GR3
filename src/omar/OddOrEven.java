package omar;

public class OddOrEven {

    /*
    Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
     */

    public static void main(String[] args) {

        oddOrEvenMethod(354);

    }

    /**
     * prints if the given number is odd or even
     * @param num int
     */
    public static void oddOrEvenMethod(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else
            System.out.println("Odd");


    }

}
