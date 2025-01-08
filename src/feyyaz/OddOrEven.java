package feyyaz;

public class OddOrEven {
    /*
**Numbers -- odd & even**

       Write a method that can identify  a given number is even or odd.

       EX:

              identify(5) --> "Odd"
              identify(6) --> "Even"
     */
    public static void main(String[] args) {

    }

    public static void oddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
